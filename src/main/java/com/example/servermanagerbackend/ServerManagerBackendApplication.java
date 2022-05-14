package com.example.servermanagerbackend;

import com.example.servermanagerbackend.model.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerManagerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerManagerBackendApplication.class, args);
    }
}
