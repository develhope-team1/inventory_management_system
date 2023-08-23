package com.develhope.imsdevelhope.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * the application context configuration.
 * @author kamar baraka.*/

@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableWebMvc
@EnableJpaRepositories(basePackages = {"com.develhope.imsdevelhope.app.persistence.repositories"})
@ComponentScan(basePackages = {"com.develhope.imsdevelhope.app", })
@EntityScan(basePackages = {"com.develhope.imsdevelhope.app.persistence.entities"})
public class AppContextConfiguration {
}
