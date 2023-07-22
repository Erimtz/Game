package com.dh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GamesLibrary {
    public static void main(String[] args) { SpringApplication.run(GamesLibrary.class); }
}