package com.example.alg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AlgApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgApplication.class, args);
    }

}
