package com.iot.ibms.ibms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author lulif
 * @program: msg_consumer
 * @create 2020-07-13 22:02
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({Sink.class})
public class MsgConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsgConsumerApplication.class, args);
    }
}
