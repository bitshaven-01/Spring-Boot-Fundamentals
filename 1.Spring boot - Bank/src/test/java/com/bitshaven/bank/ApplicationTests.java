package com.bitshaven.bank;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
