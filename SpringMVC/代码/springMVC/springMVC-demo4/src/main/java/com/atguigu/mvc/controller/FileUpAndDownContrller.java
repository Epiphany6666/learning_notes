package com.atguigu.mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
public class FileUpAndDownContrller {
    //首先实现一个下载功能
    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        //ServletContext表现的就是整个工程
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        //servletContext.getRealPath()：来获取当前服务器的部署路径
        String realPath = servletContext.getRealPath("/static/img/1.png");
        System.out.println(realPath);
        //但如果下载的不是一个固定的文件，我们从浏览器发送到服务器的请求是一定要告诉服务器你要下载的文件是什么。
        //既然知道要下载的是什么，也能获取路径

        //文件复制：先读再写
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        //is.available()：来获取我们的输入流所对应的文件的所有字节数
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中，把当前输入流所对应的文件中所有的字节全部都读到这个数组中。
        is.read(bytes);

        //创建HttpHeaders对象设置响应头信息
        //MultiValueMap其实就是一个map集合。它是一个接口，不能直接创建对象，我们需要找它的实现类：HttpHeaders，即报文的头信息
        //不管是请求头还是响应头都是键值对
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        //里面的内容只有1.png可以改，其他的都不能改
        //设置当前的下载方式，比如：attachment：以附件的方式来下载(就是谷歌浏览器里面谁谁谁已下载完毕)
        //filename：默认的文件名
        //既然功能是固定的，则值也是固定的
        headers.add("Content-Disposition", "attachment;filename=1.png");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象，bytes换句话说就是响应体，headers是响应头，响应报文里除前面两个外，还必须有响应状态码
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }

    @RequestMapping("/testUp")
    //在这里我要获取form表单中的photo数据，则在形参列表肯定也有一个形参名叫photo，类型是
    //java中File表示文件，而SpringMVC中把上传了的文件封装到了MultipartFile中
    //MultipartFile把文件所包含的信息，以及要做的操作都封装好了
    //但是我们上传的文件是不能直接转化为MultipartFile对象的！
    //如果要转换，就必须在SpringMVC中去设置一个文件上传解析器
    //但是配了没找到
    //获取bean有两种方式：1.根据id获取      2.根据类型获取
    //但是SpringMVC是根据id获取的，并且id必须要叫multipartResolver
    public String testUp(MultipartFile photo, HttpSession session) throws IOException {
        //transfer:转移，photo.transferTo就是上传，里面的参数：上传到哪
//        photo.transferTo();
        /*System.out.println(photo.getName());//表单元素的name属性值获取的是photo
        System.out.println(photo.getOriginalFilename());//获取的是1.png*/

        //获取上传的文件的文件名
        String filename = photo.getOriginalFilename();
        //获取上传的文件的后缀名
//        String suffixName = filename.substring(filename.lastIndexOf("."));
        //如果不想要横线，只需要替换即可：
        String suffixName = filename.substring(filename.lastIndexOf(".")).replaceAll("-", "");

        //将UUID作为文件名
        String uuid = UUID.randomUUID().toString();
        //将uuid和后缀名拼接后的结果作为最终的文件名
        filename = uuid + suffixName;


        //资源转移
        //由于我们现在没有文件服务器，只能传到tomcat中
        //我们现在就把它放到当前部署之后的photo目录下
        //既然我们要来获取服务器路径，就需要有session
        //通过ServletContext获取服务器中photo目录的路径
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        //由于这个路径可能不存在，可以写成动态的
        File file = new File(photoPath);
        //判断photoPath所对应路径是否存在
        if (!file.exists()) {
            //若不存在，则创建目录
            file.mkdir();
        }
        //最终的路径应该等于String finalPath = photoPath + 文件分隔符、路径分隔符，再加上最后我们所上传文件的名字
        //separator：分隔符
        String finalPath = photoPath + File.separator + filename;
        //由于设计io流问题，这里就需要处理异常
        photo.transferTo(new File(finalPath));
        return "success";
    }
}
