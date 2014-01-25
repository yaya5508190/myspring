package myspring.refAndIdref;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.refAndIdref.BeanA;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		BeanA beanA = (BeanA) context.getBean("refbeanA");
		System.out.println(beanA.getBeanBId());
		beanA.getBeanB().show();
	}
}
