package com.frozen.config;

import com.frozen.repo.WineRepository;
import com.frozen.repo.WineRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

public class DataBaseConfiguration {
    public DataBaseConfiguration() {
        System.out.println("Running DataBaseConfiguration constructor.");
    }
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        System.out.println("Running entityManagerFactory() method .");
//        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//      localContainerEntityManagerFactoryBean.setDataSource(dataSource);
//      localContainerEntityManagerFactoryBean.setPackagesToScan("com.frozen.dto");
//      localContainerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        return localContainerEntityManagerFactoryBean;
//    }
//    @Bean
//    public PlatformTransactionManager transactionManager (EntityManagerFactory entityManagerFactory)
{
//        System.out.println("Running transactionManager() method .");
//        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
//        return jpaTransactionManager;
    }
}
