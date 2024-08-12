package com.enviro.assessment.grad001.TshegofatsoUchiha47.enviro365;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.enviro.assessment.grad001.TshegofatsoUchiha47.enviro365.repository")
public class Enviro365Application {
    public static void main(String[] args) {
        SpringApplication.run(Enviro365Application.class, args);
    }
}
