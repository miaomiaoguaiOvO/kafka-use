package com.renjie.kafkause.controller;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Auther: fan
 * @Date: 2020/11/25
 * @Description:
 */
@RestController
@RequestMapping(value = "/testTopic")
public class CreateTopic {

    @Autowired
    private AdminClient adminClient;
//    @Autowired
//    private KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping(value = "/create")
    public String create(String name,int num){
        NewTopic test = new NewTopic(name, num, (short) 2);
        adminClient.createTopics(Arrays.asList(test));
        return "success";
    }


}
