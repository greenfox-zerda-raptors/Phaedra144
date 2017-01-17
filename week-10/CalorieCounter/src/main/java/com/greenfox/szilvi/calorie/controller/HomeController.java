package com.greenfox.szilvi.calorie.controller;

import com.greenfox.szilvi.calorie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ${SzilviaB} on 2017. 01. 13..
 */
@Controller
public class HomeController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/index")
    public String home(Model model, @RequestParam(name="error", defaultValue = "")String error){
        model.addAttribute("error", error);
        return "index";
    }

    @RequestMapping("/login")
    public String validate(@RequestParam(name="username")String username, @RequestParam(name="password") String password){
        try{
            if(userRepo.findOne(username).getPassword().equals(password)){
                return "redirect:/meals";
            }else{
                return "redirect:/index?error=Invalid password";
            }
        }catch(Exception e){
            return "redirect:/index?error=Invalid username or password";
        }

    }


}
