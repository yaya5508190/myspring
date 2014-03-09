package myspring.propertyEditors;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.annotation.autowired.MovieRecommender;
import bean.propertyEditors.DependsOnExoticType;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext("classpath:bean/propertyEditors/context.xml");
		DependsOnExoticType bean = (DependsOnExoticType) context.getBean("sample");
		System.out.println(bean.getType());
	}
}
