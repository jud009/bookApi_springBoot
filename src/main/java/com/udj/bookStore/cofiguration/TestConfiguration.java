package com.udj.bookStore.cofiguration;
import com.udj.bookStore.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Autowired
    private DatabaseService databaseService;

    @Bean
    public void init(){
        databaseService.init();
    }
}
