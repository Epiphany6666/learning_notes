package cn.itcast.order.service;

import cn.itcast.order.clients.UserClient;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.利用RestTemplate发起http请求，查询用户
        // 参数1：URL路径，这个和浏览器里的路径是完全一样的
        // 2.1 url路径
//        String url = "http://userservice/user/" + order.getUserId();
//        // 2.2 发送http请求：实现远程调用
//        // 得到的结果是一个JSON风格，但我们想要的是user对象，但是RestTemplate非常的智能
//        // 参数2：responseType 返回值类型。例如这里填User.class，它会自动帮你反序列化成User类型
//        User user = restTemplate.getForObject(url, User.class);
        User user = userClient.findById(order.getUserId());
//        // 封装user到Order

        order.setUser(user);
        // 4.返回
        return order;
    }
}
