package cn.itcast.hotel;

import cn.itcast.hotel.pojo.HotelDoc;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.search.suggest.Suggest;
import org.elasticsearch.search.suggest.SuggestBuilder;
import org.elasticsearch.search.suggest.SuggestBuilders;
import org.elasticsearch.search.suggest.completion.CompletionSuggestion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class HotelSearchTest {
    private RestHighLevelClient client;

    @BeforeEach
    void setUp() {
        client = new RestHighLevelClient(RestClient.builder(HttpHost.create("192.168.88.130:9200")));
    }

    @Test
    void testSuggest() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                        .suggest(
                                new SuggestBuilder().addSuggestion(
                                        "mySuggestion",
                                        SuggestBuilders
                                                .completionSuggestion("suggestion")
                                                .prefix("h")
                                                .skipDuplicates(true)
                                                .size(10)

                                )
                        );
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        Suggest suggest = response.getSuggest();
        CompletionSuggestion suggestion = suggest.getSuggestion("mySuggestion");
        for (CompletionSuggestion.Entry.Option option : suggestion.getOptions()) {
            String json = option.getText().string();
            System.out.println(json);
        }
    }

    @AfterEach
    void tearDown() throws IOException {
        client.close();
    }

    /**
     * match_all查询
     *
     * @throws IOException
     */
    @Test
    void testMatchAll() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                .query(QueryBuilders.matchAllQuery());
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        handleResponse(response);
    }

    @Test
    void testBool() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                .query(
                        QueryBuilders.boolQuery()
                                .must(QueryBuilders.termQuery("city", "上海"))
//                                .filter(QueryBuilders.rangeQuery("price").lte(250))
                );
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        handleResponse(response);
    }

    private static void handleResponse(SearchResponse response) {
        SearchHits searchHits = response.getHits();
        long total = searchHits.getTotalHits().value;
        System.out.println("共搜索到" + total + "条数据");
        SearchHit[] hits = searchHits.getHits();
        for (SearchHit hit : hits) {
            String json = hit.getSourceAsString();
            HotelDoc hotelDoc = JSON.parseObject(json, HotelDoc.class);
            Map<String, HighlightField> highlightFields = hit.getHighlightFields();
            if (!CollectionUtils.isEmpty(highlightFields)) {
                HighlightField highlightField = highlightFields.get("name");
                if (highlightField != null) {
                    String name = highlightField.getFragments()[0].string();
                    hotelDoc.setName(name);
                }
            }
            System.out.println(hotelDoc);
        }
    }

    /**
     * 全文检索：match
     */
    @Test
    void testMatch() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                .query(QueryBuilders.matchQuery("all", "如家"));
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        handleResponse(response);
    }

    /**
     * 全文检索：multi_match
     */
    @Test
    void testMultiMatch() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                .query(QueryBuilders.multiMatchQuery("如家", "all", "business"));
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        handleResponse(response);
    }

    /**
     * 测试分页和排序
     *
     * @throws IOException
     */
    @Test
    void testPageAndSort() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                .query(QueryBuilders.matchAllQuery());
        request.source().from(0).size(3);
        request.source().sort("price", SortOrder.ASC);
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        handleResponse(response);
    }

    /**
     * 测试高亮
     */
    @Test
    void testHighlight() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                .query(QueryBuilders.matchQuery("all", "如家"));
        request.source()
                .highlighter(new HighlightBuilder().field("name").requireFieldMatch(false));
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        handleResponse(response);
    }

    @Test
    void testAggregation() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source()
                .size(0)
                .query(QueryBuilders.rangeQuery("price").lte(200));
        request.source().aggregation(AggregationBuilders
                .terms("brandAgg")
                .field("brand")
                .size(20));



        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        Aggregations aggregations = response.getAggregations();
        Terms brandTerms = aggregations.get("brandAgg");
        List<? extends Terms.Bucket> buckets = brandTerms.getBuckets();
        for (Terms.Bucket bucket : buckets) {
            String brandName = bucket.getKeyAsString();
            System.out.println(brandName);
        }
    }
}
