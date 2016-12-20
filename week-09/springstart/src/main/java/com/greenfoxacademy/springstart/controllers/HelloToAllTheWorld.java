package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 12. 20..
 */
@Controller
public class HelloToAllTheWorld {

    Random rand = new Random();

    String [] colors =  {"red", "blue", "pink", "purple", "yellow", "orange", "green", "silver"};

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/web/greetingWorld")
    public String greetingWorld(Model model) {
        model.addAttribute("hello", hellos[rand.nextInt(hellos.length)]);
        model.addAttribute("color", colors[rand.nextInt(colors.length)]);
        model.addAttribute("size", rand.nextInt(20) + 10);
        return "greetingworld";
    }
}
