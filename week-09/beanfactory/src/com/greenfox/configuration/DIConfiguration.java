package com.greenfox.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.greenfox.services.TwitterService;
import com.greenfox.services.MessageService;
import com.greenfox.services.EmailService;

/*
@Configuration annotation is used to let Spring know that it’s a Configuration class.
@ComponentScan annotation is used with @Configuration annotation to specify the packages to look for Component classes.
@Bean annotation is used to let Spring framework know that this method should be used to get the bean implementation to inject in Component classes.
 */

@Configuration
@ComponentScan(value = {"com.greenfox.consumer"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }

}

