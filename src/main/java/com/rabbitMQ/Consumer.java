package com.rabbitMQ;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/3/4.
 */
public class Consumer{
    public void listen(String message) {
        System.out.println("接收消息： " + message);
    }

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("recevice.xml");
    }

}
