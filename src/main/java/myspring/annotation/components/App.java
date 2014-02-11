package myspring.annotation.components;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.annotation.components.BeanA;
import bean.annotation.components.MovieRecommender;
import bean.annotation.components.TestBean;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext("AnnotationContext.xml");
		BeanA beanA1 =  (BeanA) context.getBean("beanA");
		BeanA beanA2 =  (BeanA) context.getBean("beanA");
		System.out.println(beanA1.getBeanB().getRandom());
		System.out.println(beanA2.getBeanB().getRandom());
		
		TestBean testBean1 =  (TestBean) context.getBean("privateInstance");
		TestBean testBean2 =  (TestBean) context.getBean("privateInstance");
		System.out.println(testBean1.getSpouse().getAge());
		System.out.println(testBean2.getSpouse().getAge());
		
		TestBean testBean3 =  (TestBean) context.getBean("protectedInstance");
		TestBean testBean4 =  (TestBean) context.getBean("protectedInstance");
		
		
		System.out.println(testBean3.getCountry());
		System.out.println(testBean4.getCountry());
		
		MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
		System.out.println(movieRecommender.getActionVshMovie().getName());
		System.out.println(movieRecommender.getActionDvdMovie().getName());
	}
}
