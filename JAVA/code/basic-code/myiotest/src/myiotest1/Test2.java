package myiotest1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据，把网址上所有的数据拼接成一个字符串
        //由于要爬取三次，因此定义成方法，后面调用三次即可。
        //familyName：表示里面装的是所有的姓氏。Str：并且它是以字符串的姓氏来进行表示的
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

//        System.out.println(familyNameStr);
//        System.out.println(boyNameStr);
//        System.out.println(girlNameStr);
        ArrayList<String> familyNameTempList = getData(familyNameStr, "([\u4E00-\u9FA5]{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr,"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTempList = getData(girlNameStr,"(.. ){4}..",0);
        System.out.println(girlNameTempList);

        //4.处理数据
        //familyNameTempList（姓氏）
        //处理方案：把每一个姓氏拆开并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            //str 赵钱孙李  周吴郑王   冯陈褚卫   蒋沈韩杨
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }
        //boyNameTempList（男生的名字）
        //处理方案：去除其中的重复元素
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if(!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }
        //girlNameTempList（女生的名字）
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            Collections.addAll(girlNameList, str.split("\\s"));
        }
        System.out.println(girlNameList);

    }

    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            list.add(m.group(index));
        }
        return list;
    }

    /*
     * crawler：爬虫
     * 作用：
     *   从网络中爬取数据，把数据拼接成字符串返回
     * 形参：
     *   网址
     * 返回值：
     *   爬取到的所有数据
     * */
    public static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象，url就表示网址的对象
        URL url = new URL(net);
        //3.链接上这个网址
        //细节：必须保证网络是畅通的，而且这个网址是可以链接上的。
        URLConnection conn = url.openConnection();
        //4.读取数据
        //getInputStream()：获取到输入流，网址上所有的数据通过这个输入流就能读到了
        //但是InputStream是一个字节流，由于在网址上有可能会有中文，这个中文就不能用字节流去读了，因为可能会乱码。因此我们需要将字节流进行转换，转换为字符流
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1){
            sb.append((char)ch);
        }
        //5.释放资源
        isr.close();
        //6.把读取到的数据返回
        return sb.toString();
    }
}
