package bean.javaBaseConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(AppConfig.class)
public class ImportConfig {
	@Bean
	public MyBean getMyBean() {
		return new MyBean("ImportConfig");
	}
}
