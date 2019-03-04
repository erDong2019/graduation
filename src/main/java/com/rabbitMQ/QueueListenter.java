package com.rabbitMQ;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2019/3/4.
 */
public class QueueListenter implements MessageListener {
    @Override
    public void onMessage(Message msg) {
        try {
            System.out.println("-------------------"+new String(msg.getBody(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }
}
