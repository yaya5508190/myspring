package bean.customEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "emailService")
	public EmailService getEmailService(){
		List<String> blackList = new ArrayList<String>(Arrays.asList("111@yahoo.com","222@qq.com"));
		EmailService emailService = new EmailService();
		emailService.setBlackList(blackList);
		return emailService;
	}
	
	@Bean
	public NewBlackListNotifier getNewBlackListNotifier(){
		NewBlackListNotifier notifier = new NewBlackListNotifier();
		return notifier;
	}
	
	@Bean
	public BlackListNotifier getBlackListNotifier(){
		BlackListNotifier notifier = new BlackListNotifier();
		notifier.setNotifierEmail("333@gmail.com");
		return notifier;
	}
}
