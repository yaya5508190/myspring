package myspring.annotation.components;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.annotation.components.BeanA;
import bean.annotation.components.TestBean;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext("AnnotationContext.xml");
		BeanA bean =  (BeanA) context.getBean("beanA");
		System.out.println(bean.getBeanB().getName());
		
		TestBean testBean1 =  (TestBean) context.getBean("getTestBean");
		TestBean testBean2 =  (TestBean) context.getBean("getTestBean");
		System.out.println(testBean1==testBean2);
	}
}
