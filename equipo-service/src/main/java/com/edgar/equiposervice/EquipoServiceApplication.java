package com.edgar.equiposervice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EquipoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EquipoServiceApplication.class, args);
    }

}
