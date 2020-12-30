package com.test.mdh;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MdhApplicationTests {



    @Test
    void contextLoads() {
        JpaTest jpaTest = new JpaTest();
        jpaTest.addTest();
    }

}
