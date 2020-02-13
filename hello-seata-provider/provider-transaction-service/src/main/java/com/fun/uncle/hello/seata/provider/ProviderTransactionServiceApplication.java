package com.fun.uncle.hello.seata.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/2/13  14:07
 * @Version: 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderTransactionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderTransactionServiceApplication.class, args);
    }
}
