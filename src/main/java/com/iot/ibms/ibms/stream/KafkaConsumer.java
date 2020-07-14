package com.iot.ibms.ibms.stream;

import com.iot.ibms.ibms.entity.User;
import com.iot.ibms.ibms.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lulif
 * @program: msg_consumer
 * @create 2020-07-13 22:08
 **/
@Slf4j
@Service
public class KafkaConsumer {

    @Autowired
    private UserRepository userRepository;

    @StreamListener(Sink.INPUT)
    public void receive(@Payload String msg, @Headers Map map) {
        //TODO消费消息
        System.out.println(msg);
    }
}
