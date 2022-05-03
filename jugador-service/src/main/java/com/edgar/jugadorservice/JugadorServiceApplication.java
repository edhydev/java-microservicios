package com.edgar.jugadorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JugadorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JugadorServiceApplication.class, args);
    }

}
