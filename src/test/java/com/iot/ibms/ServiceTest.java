package com.iot.ibms;

import com.iot.ibms.ibms.MsgConsumerApplication;
import com.iot.ibms.ibms.entity.User;
import com.iot.ibms.ibms.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lulif
 * @program: msg_consumer
 * @create 2020-07-14 21:06
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MsgConsumerApplication.class})
public class ServiceTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
//        Iterable<User> iterable = userRepository.findAll();
//        iterable.forEach(user -> System.out.println(user));

        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User(i, String.valueOf(i));
            userList.add(user);
        }
        Iterable<User> iterable1 = userRepository.saveAll(userList);
        System.out.println(123);
    }
}
