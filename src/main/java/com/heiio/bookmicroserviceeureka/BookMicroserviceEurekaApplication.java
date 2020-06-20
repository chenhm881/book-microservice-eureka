package com.heiio.bookmicroserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookMicroserviceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMicroserviceEurekaApplication.class, args);
    }

}
