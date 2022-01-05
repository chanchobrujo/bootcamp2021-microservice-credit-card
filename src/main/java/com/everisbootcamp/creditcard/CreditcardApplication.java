package com.everisbootcamp.creditcard;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class CreditcardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditcardApplication.class, args);
        log.info("MICROSERVER CREDIT CARDS ENABLED");
    }
}
