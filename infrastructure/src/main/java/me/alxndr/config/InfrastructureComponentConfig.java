package me.alxndr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "me.alxndr")
@EnableJpaRepositories(basePackages = "me.alxndr")
public class InfrastructureComponentConfig {

}
