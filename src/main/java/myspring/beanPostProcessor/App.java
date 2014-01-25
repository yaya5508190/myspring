package myspring.beanPostProcessor;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
	}
}
