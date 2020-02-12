package com.fun.uncle.hello.seata.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/2/12  23:14
 * @Version: 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableDiscoveryClient
@MapperScan(basePackages = "com.fun.uncle.hello.seata.provider.mapper")
public class ProviderOrderItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderOrderItemServiceApplication.class, args);
    }
}
