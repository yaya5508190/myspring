package bean.messageSource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class i18nConfig {
	@Bean(name = "messageSource")
	public MessageSource getMessageSource(){
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		//不用添加全文件名
		messageSource.setBasenames("bean/messageSource/language");
		return messageSource;
	}
}
