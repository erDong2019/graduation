package com.rabbitMQ;

/**
 * Created by Administrator on 2019/3/4.
 */

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Producer {

    public static void main(String[] args) throws InterruptedException {
        //读取spring的配置文件
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        //获取RabbitTemplate
        RabbitTemplate template = ctx.getBean(RabbitTemplate.class);

        //发送消息
        template.convertAndSend("你好");
        Thread.sleep(1000);

        //销毁
        ctx.destroy();
    }
}