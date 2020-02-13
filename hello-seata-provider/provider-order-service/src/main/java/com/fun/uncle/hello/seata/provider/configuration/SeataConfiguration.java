package com.fun.uncle.hello.seata.provider.configuration;

import com.zaxxer.hikari.HikariDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


/**
* @Description:     每个需要参与分布式事务的服务都需要将数据源交由 Seata 托管
* @Author:         Xian
* @CreateDate:     2020/2/12 23:11
* @Version:        0.0.1-SNAPSHOT
*/

@Configuration
public class SeataConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        return hikariDataSource;
    }
    @Primary
    @Bean("dataSource")
    public DataSourceProxy dataSource(DataSource hikariDataSource) {
        return new DataSourceProxy(hikariDataSource);
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSourceProxy dataSourceProxy) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSourceProxy);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:/mapper/*.xml"));
        sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
        return sqlSessionFactoryBean.getObject();
    }
    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        /**
         * applicationId：同服务名即可
         * txServiceGroup：自定义事务组名，需要与 Seata Server 配置一致
         */
        return new GlobalTransactionScanner("hello-seata-provider-order", "tx_group");
    }
}
