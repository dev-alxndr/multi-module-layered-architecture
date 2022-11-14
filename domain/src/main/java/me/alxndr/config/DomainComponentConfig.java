package me.alxndr.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"me.alxndr"
})
@EntityScan(basePackages = "me.alxndr")
public class DomainComponentConfig {

}
