package cn.itcast.gateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;

//@Order(-1) // 顺序注解，里面需要给一个int值。默认值为21亿4千7百48万。这个值越小，优先级越高，所以默认值其实是优先级最低的
//@Component // 6.定义component组件，将它放到spring容器中作为一个bean
//public class AuthorizeFilter implements GlobalFilter {
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        // 1.通过上下文获取请求参数，exchange.getRequest()：这里获取的request对象并不是servlet里的request
//        ServerHttpRequest request = exchange.getRequest();
//        // params的类型是一个Map，而且这个Map还有些特殊，当然它还是key，value结构。key就是我们的参数名称，值就是对应的值
//        MultiValueMap<String, String> params = request.getQueryParams();
//        // 2.获取authorization参数，取的时候有两个方法，我们一般会选择getFirst，取的时候选第一个匹配的
//        String auth = params.getFirst("authorization");
//        // 3.判断参数值是否等于 admin
//        if ("admin".equals(auth)) {
//            // 4.等于 =》 放行，当你调用filter那一刻，其实它是从一个过滤器链里找到下一个过滤器的filter方法，就等于放行了，而它的返回值就是Mono，直接return即可
//            return chain.filter(exchange);
//        }
//        // 5.不等于 =》 拦截，然后结束处理，但这样拦截的用户体验不好，所以需要给用户一个提示：设置状态码
//        // 5.1 设置状态码，401代表的是未登录
//        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        return exchange.getResponse().setComplete();
//    }
//}