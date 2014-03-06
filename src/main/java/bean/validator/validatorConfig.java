package bean.validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.DefaultMessageCodesResolver;

@Configuration
public class validatorConfig {
	@Bean(name="validator")
	public CustomValidator getValidator(){
		return new CustomValidator();
	}
	
	@Bean
	public DefaultMessageCodesResolver getDefaultMessageCodesResolver(){
		DefaultMessageCodesResolver res = new DefaultMessageCodesResolver();
		res.setPrefix("error:");
		return res;
	}
}
