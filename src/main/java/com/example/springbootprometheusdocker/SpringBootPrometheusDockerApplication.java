package com.example.springbootprometheusdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootPrometheusDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPrometheusDockerApplication.class, args);
    }

}
