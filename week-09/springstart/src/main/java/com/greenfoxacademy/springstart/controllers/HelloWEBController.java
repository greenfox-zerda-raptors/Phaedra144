package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ${SzilviaB} on 2016. 12. 19..
 */
@Controller
public class HelloWEBController {

    private AtomicLong num = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("count", num);
        long id = num.incrementAndGet();
        return "greeting";
    }


}
