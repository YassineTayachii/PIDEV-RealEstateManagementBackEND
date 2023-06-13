package com.example.pidev_gestion_immo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.pidev_gestion_immo.services","com.example.pidev_gestion_immo.controller"})
public class PidevGestionImmoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PidevGestionImmoApplication.class, args);
    }

}
