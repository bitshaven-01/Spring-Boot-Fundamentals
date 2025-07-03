package com.bitshaven.bank.controllers;

import com.bitshaven.bank.models.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    /* In Application.java file, a bean of type "Hello" has already been created, with the following text:
     *     "Hello , If you see this message this means dependency injection is working."
     * This annotation will allow spring to automatically search for and inject a bean of type Hello (if found) into this class.
     *  now "hello" variable defined below, points to same instance defined using @Bean annotation, and you can check that by
     *  calling getMessage() method (see the method 'getHelloMsg()' below).
     * */
    @Autowired
    private Hello hello;
    // name property is optional (value="/")
    @RequestMapping("/")
    @ResponseBody
    String HelloWorld(){
        return "Bank - welcome Page";
    }

    @RequestMapping(value = "/hello")

    @ResponseBody
    String getHelloMsg(){
        return hello.getMessage();
    }
}
