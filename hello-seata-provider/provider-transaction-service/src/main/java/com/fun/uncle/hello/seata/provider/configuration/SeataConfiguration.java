package com.fun.uncle.hello.seata.provider.configuration;


import io.seata.spring.annotation.GlobalTransactionScanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
* @Description:     每个需要参与分布式事务的服务都需要将数据源交由 Seata 托管
* @Author:         Xian
* @CreateDate:     2020/2/12 23:11
* @Version:        0.0.1-SNAPSHOT
*/

@Configuration
public class SeataConfiguration {

    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        /**
         * applicationId：同服务名即可
         * txServiceGroup：自定义事务组名，需要与 Seata Server 配置一致
         */
        return new GlobalTransactionScanner("hello-seata-provider-transaction", "tx_group");
    }
}
