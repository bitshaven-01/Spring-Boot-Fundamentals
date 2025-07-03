package com.bitshaven.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
/* Tells spring to find a class marked with @SpringBootApplication, and use it to create Spring application context (container for all beans in our app).
 * It starts the application context, creates beans, and provides the necessary configuration, including potentially starting an embedded server for web applications.
 * */
@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

}
