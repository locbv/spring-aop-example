package com.ldt.demospringaop;

import com.ldt.demospringaop.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringAopApplicationTests {

    @Autowired
    TestService testService;

    @Test
    void callTestService() {
//        testService.callDaoSuccess();
//        try {
//            testService.callDaoFailed();
//        } catch (Exception ex) {
//
//        }

        testService.callDaoTrackTime();

    }

}
