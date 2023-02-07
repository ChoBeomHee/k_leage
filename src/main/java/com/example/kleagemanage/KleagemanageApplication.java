package com.example.kleagemanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.kleagemanage.model"})
@EnableJpaRepositories(basePackages = {"com.example.kleagemanage.Repository"})

public class KleagemanageApplication {
    public static void main(String[] args) {
        SpringApplication.run(KleagemanageApplication.class, args);
    }

}
