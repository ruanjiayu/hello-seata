package com.fun.uncle.hello.seata.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/2/13  14:46
 * @Version: 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessTransactionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessTransactionServiceApplication.class, args);
    }
}
