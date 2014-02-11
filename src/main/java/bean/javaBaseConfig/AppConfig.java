package bean.javaBaseConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public MyBean getBean(){
		return new MyBean("AppConfig");
	}
}
