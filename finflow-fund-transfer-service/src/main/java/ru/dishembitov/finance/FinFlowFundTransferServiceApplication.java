package ru.dishembitov.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FinFlowFundTransferServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinFlowFundTransferServiceApplication.class, args);
    }

}
