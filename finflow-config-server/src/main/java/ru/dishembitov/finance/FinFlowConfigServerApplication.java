package ru.dishembitov.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FinFlowConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinFlowConfigServerApplication.class, args);
    }

}
