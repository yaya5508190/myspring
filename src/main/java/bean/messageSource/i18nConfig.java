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
		messageSource.setBasenames("bean/messageSource/language_zh_CN","bean/messageSource/language_en_US");
		return messageSource;
	}
}
