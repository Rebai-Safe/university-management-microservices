package com.sid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProfessorsServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProfessorsServiceApplication.class, args);
    }

}
