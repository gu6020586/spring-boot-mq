package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Test {

    @Autowired
    private KafkaTemplate kafkaTemplate;


    public void send(){

            this.kafkaTemplate.send("test","这是测试消息");


    }
}
