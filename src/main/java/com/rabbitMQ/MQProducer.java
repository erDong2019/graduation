package com.rabbitMQ;

import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 2019/3/4.
 */
@Repository
public interface MQProducer {
    /**
     * 发送消息到指定队列
     * @param queueKey
     * @param object
     */
    public void sendDataToQueue(String queueKey, Object object);
}
