package com.renjie.kafkause;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class KafkaUseApplicationTests {

    @Test
    void contextLoads() {
        String name1 = "offset";
        String name2 = "logstash";
        String name3 = "renjie";
        System.out.println(name1.hashCode()%50);
        System.out.println(name2.hashCode()%50);
        System.out.println(name3.hashCode()%50);
    }

}
