package com.udj.bookStore.cofiguration;


import com.udj.bookStore.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfiguration {

    @Autowired
    private DatabaseService databaseService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy;

    @Bean
    public boolean dbInstance(){
        if (strategy.equals("create")){
            databaseService.init();
        }
        return false;
    }
}
