package com.fun.uncle.hello.seata.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/2/13  13:26
 * @Version: 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "com.fun.uncle.hello.seata.provider.mapper")
public class ProviderOrderApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProviderOrderApplication.class, args);
    }

}
