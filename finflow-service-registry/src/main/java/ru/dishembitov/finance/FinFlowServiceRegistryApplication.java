package ru.dishembitov.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FinFlowServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinFlowServiceRegistryApplication.class, args);
    }

}
