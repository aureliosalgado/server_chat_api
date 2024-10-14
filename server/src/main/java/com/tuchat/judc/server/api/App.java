package com.tuchat.judc.server.api;

import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.tuchat.judc.server.repository")
@EntityScan("com.tuchat.judc.server.model")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
	