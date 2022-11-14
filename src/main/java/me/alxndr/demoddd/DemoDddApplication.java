package me.alxndr.demoddd;

import me.alxndr.config.ApplicationComponentConfig;
import me.alxndr.config.InfrastructureComponentConfig;
import me.alxndr.config.DomainComponentConfig;
import me.alxndr.config.InterfaceComponentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({
		DomainComponentConfig.class,
		InterfaceComponentConfig.class,
		InfrastructureComponentConfig.class,
		ApplicationComponentConfig.class
})
@SpringBootApplication
public class DemoDddApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDddApplication.class, args);
	}

}
