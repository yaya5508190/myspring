package myspring.myBeanNameGenerator;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.annotation.autowired.MovieRecommender;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext("AnnotationContext.xml");
	}
}
