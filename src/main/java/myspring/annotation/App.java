package myspring.annotation;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.annotation.BeanA;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		BeanA beanA = (BeanA) context.getBean("annotationBeanA");
		System.out.println(beanA.getBeanB().getString());
	}
}
