package myspring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyUtil {
	public static ApplicationContext getContext(){
		return new ClassPathXmlApplicationContext("context.xml");
	}
	
	public static ApplicationContext getContext(String fileName){
		return new ClassPathXmlApplicationContext(fileName);
	}
}
