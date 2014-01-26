package myspring.customizingBeanFactory;

import myspring.util.MyUtil;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.beanFactoryPostProcessor.Bean;
import bean.customizingBeanFactory.MyBeanFactory;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		String s = (String) context.getBean("myBeanFactory");
		System.out.println(s);
	}
}
