package com.greenfoxacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.time.LocalDateTime.now;

/**
 * Created by ${SzilviaB} on 2016. 12. 20..
 */
@Controller
public class HelloController {


    @RequestMapping (value="/helloWorld")
    public String greeting (Model model, @RequestParam(defaultValue = "Thymeleaf", name="name", required = false) String name){
        model.addAttribute("name", name);
        model.addAttribute("time", now());
        return "greeting";
    }


}
