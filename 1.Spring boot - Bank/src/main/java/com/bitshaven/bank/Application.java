package com.bitshaven.bank;

import com.bitshaven.bank.models.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
/*
 * @SpringBootApplication a top-level annotation, it defines several sub-annotations such as:
 * @SpringBootConfiguration : tells spring container that this class can have several @bean definitions (see getHelloText bean).
 * @EnableAutoConfiguration : allows springboot to automatically configure spring boot application's dependencies.
 * @ComponentScan : tells spring to scan through all classes (found in this package com.bitshaven.springboot) and look for annotations,
 * such as @Service,@Component, and whatnot.
 * */
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /* In this example, I defined a custom bean that returns a string. You can use this bean at runtime using @Autowired annotation.
     *  see controllers/HomeController.java/getHelloMsg
     * */
    @Bean
    public Hello getHelloText(){
        Hello hello = new Hello();
        hello.setMessage("Hello , If you see this message this means dependency injection is working.");
        return hello;
    }

}
