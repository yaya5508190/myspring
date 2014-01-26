package myspring.beanFactoryPostProcessor;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.beanFactoryPostProcessor.Bean;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		Bean bean = (Bean) context.getBean("beanFactoryProcessorBean");
		System.out.println(bean.getS());
	}
}
