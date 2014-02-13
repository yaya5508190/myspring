package myspring.customEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import bean.customEvent.AppConfig;
import bean.customEvent.EmailService;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService bean = (EmailService) context.getBean("emailService");
		bean.sendEmail("111@yahoo.com", "send");
	}
}
