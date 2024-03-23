package cn.itcast.mq.helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class PublisherTest {
    @Test
    public void testSendMessage() throws IOException, TimeoutException {
        // 1.建立连接，ConnectionFactory：连接工厂，要向MQ发送消息，就需要建立连接，而建立连接就必须得用连接工厂了。
        ConnectionFactory factory = new ConnectionFactory();
        // 1.1.设置连接参数（MQ地址信息），分别是：主机名、端口号、vhost、用户名、密码
        factory.setHost("1.12.77.253");
        // MQ当中消息通信使用的是5672，ui管理台是15672
        factory.setPort(5672);
        // 每个用户都会有自己的虚拟主机，itcast就有/这个虚拟主机的访问权
        factory.setVirtualHost("/");
        // 设置用户名
        factory.setUsername("itcast");
        // 设置密码
        factory.setPassword("123321");
        // 1.2.连接工程准备好了，参数准备好了，接下来就是建立连接了
        // 这行代码一旦走完，回到控制台的Connection界面看一眼，可以发现已经有一个连接了
        Connection connection = factory.newConnection();

        // 2.创建通道Channel
        Channel channel = connection.createChannel();

        // 3.创建队列
        String queueName = "simple.queue"; // 声明队列的名称
        // queueDeclare：声明队列，第一个参数是队列名称，剩下的我们不需要管
        channel.queueDeclare(queueName, false, false, false, null);

        // 4.发送消息
        String message = "hello, rabbitmq!";
        // basicPublish：发布消息，往 queueName发（第二个参数），message.getBytes()将消息转成字节发送
        channel.basicPublish("", queueName, null, message.getBytes());
        System.out.println("发送消息成功：【" + message + "】");

        // 5.关闭通道和连接
        channel.close();
        connection.close();

    }
}
