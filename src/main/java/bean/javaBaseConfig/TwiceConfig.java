package bean.javaBaseConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwiceConfig {
	@Bean
	public RandomBean getBean1(){
		RandomBean bean = new RandomBean();
		bean.setBean(getBean3());
		return bean;
	}
	
	@Bean
	public RandomBean getBean2(){
		RandomBean bean = new RandomBean();
		bean.setBean(getBean3());
		return bean;
	}
	
	@Bean
	public RandomBean getBean3(){
		RandomBean bean = new RandomBean();
		return bean;
	}
}
