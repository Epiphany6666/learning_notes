package cn.itcast.mq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class fanoutExchange {
    // itcast.fanout
    @Bean
    public FanoutExchange fanoutExchange1() {
        return new FanoutExchange("itcast.fanout");
    }

    // fanout.queue1
    @Bean
    public Queue fanoutQueue1() {
        return new Queue("fanout.queue1");
    }
    // 绑定交换机1到交换机
    @Bean
    public Binding fanoutBanding1(Queue fanoutQueue1, FanoutExchange fanoutExchange1) {
        return BindingBuilder.bind(fanoutQueue1).to(fanoutExchange1);
    }

    //fanout.queue2
    // fanout.queue1
    @Bean
    public Queue fanoutQueue2() {
        return new Queue("fanout.queue2");
    }
    // 绑定交换机2到交换机
    @Bean
    public Binding fanoutBanding2(Queue fanoutQueue2, FanoutExchange fanoutExchange1) {
        return BindingBuilder.bind(fanoutQueue2).to(fanoutExchange1);
    }

}
