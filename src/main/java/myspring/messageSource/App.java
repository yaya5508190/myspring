package myspring.messageSource;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("bean.messageSource");
		context.refresh();
		MessageSource messageSource = context;
		Locale zhLocale = new Locale("zh", "CN");
		Locale enLocale = new Locale("en", "US");
		String message = messageSource.getMessage("text", new String[]{"hello"},zhLocale);
		System.out.println(message);
	}
}
