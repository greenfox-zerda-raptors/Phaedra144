package com.workshop03.configuration;

import com.workshop03.services.SpellChecker;
import com.workshop03.services.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${SzilviaB} on 2017. 01. 01..
 */
@Configuration
@ComponentScan(value = {"com.workshop03.services"})
public class AppConfig {

    public TextEditor textEditor() {
        return new TextEditor();
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}