package com.workshop03.services;

import com.workshop03.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ${SzilviaB} on 2017. 01. 01..
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TextEditor sc = context.getBean(TextEditor.class);
        sc.spellCheck("Woof");
        System.out.println(sc.printing("Woof"));
    }
}
