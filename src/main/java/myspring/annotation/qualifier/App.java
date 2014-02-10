package myspring.annotation.qualifier;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.annotation.autowired.MovieRecommender;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		MovieRecommender movieRecommender = (MovieRecommender) context.getBean("MovieRecommender");
		System.out.println(movieRecommender.getActionDvdMovie().getName());
		System.out.println(movieRecommender.getActionVshMovie().getName());
		System.out.println(movieRecommender.getComedyDvdMovie().getName());
		System.out.println(movieRecommender.getComedyVshMovie().getName());
		System.out.println(movieRecommender.getCustomQualifier().getName());
	}
}
