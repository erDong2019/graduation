package com.rabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2019/3/4.
 */
public class MQProducerImpl implements MQProducer {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendDataToQueue(String queueKey, Object object) {
        System.out.println("--"+amqpTemplate);
        try {
            amqpTemplate.convertAndSend(object);
            System.out.println("------------消息发送成功");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
