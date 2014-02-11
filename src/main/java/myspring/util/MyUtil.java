package myspring.util;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyUtil {
	public static ApplicationContext getContext(){
		return new ClassPathXmlApplicationContext("context.xml");
	}
	
	public static ApplicationContext getContext(String fileName){
		return new ClassPathXmlApplicationContext(fileName);
	}
	
	public static int getRandom(){
		Random random = new Random();
		return random.nextInt(100);
	}
	
	public static int getRandom(int i){
		Random random = new Random();
		return random.nextInt(i);
	}
}
