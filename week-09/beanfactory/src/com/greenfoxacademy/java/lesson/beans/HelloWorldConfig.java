package com.greenfoxacademy.java.lesson.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${SzilviaB} on 2016. 12. 21..
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
    @Bean
    public WithFries withfries(){
        return new WithFries();
    }
}