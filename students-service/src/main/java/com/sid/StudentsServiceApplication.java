package com.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //quand tu demarre publie ta reference dans l'annuaire
@SpringBootApplication
public class StudentsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentsServiceApplication.class, args);
    }

}
