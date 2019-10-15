package com.syphan.practice.boardinghouserestfullapi;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class BoardingHouseRestfullApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardingHouseRestfullApiApplication.class, args);
    }

}
