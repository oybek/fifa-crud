
package boo.fifa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
	basePackages = {
		  "boo.fifa.controller"
		, "boo.fifa.dao"
		, "boo.fifa.service"
	}
)
public class ApplicationConfig {
}

