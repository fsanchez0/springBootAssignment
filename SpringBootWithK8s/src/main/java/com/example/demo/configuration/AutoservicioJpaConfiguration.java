package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.example.demo"},
        entityManagerFactoryRef = "autoservicioEntityManagerFactory",
        transactionManagerRef = "autoservicioTransactionManager"
)
public class AutoservicioJpaConfiguration {

    @Bean(name = "autoservicioDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.autoservicio")
    public DataSource autoservicioDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "autoservicioEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean autoservicioEntityManagerFactory(EntityManagerFactoryBuilder builder,
            @Qualifier("autoservicioDataSource") DataSource autoservicioDataSource){
        return builder
                .dataSource(autoservicioDataSource)
                .packages("com.fsanchez.tests.losnogalesapi.autoservicio")
                .build();
    }

    @Bean(name = "autoservicioTransactionManager")
    public PlatformTransactionManager autoservicioTransactionManager(
            @Qualifier("autoservicioEntityManagerFactory") EntityManagerFactory autoservicioEntityManagerFactory){
        return new JpaTransactionManager(autoservicioEntityManagerFactory);
    }
}
