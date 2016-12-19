package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ${SzilviaB} on 2016. 12. 19..
 */
@RestController
public class HelloRESTController {

    private AtomicLong counter = new AtomicLong(0);

    @RequestMapping
    public Greeting greeting (@RequestParam String name){
        long id = counter.incrementAndGet();
        return new Greeting(id, "Hello " + name + "!");
    }
}
