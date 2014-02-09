package myspring.customizingFactoryBean;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.customizingFactoryBean.MyFactoryBean;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		//加&获取FactoryBean本身
		MyFactoryBean factoryBean = (MyFactoryBean) context.getBean("&myFactoryBean");
		//不加&获取FactoryBean生产出来的bean
		String s = (String) context.getBean("myFactoryBean");
		System.out.println(s);
		System.out.println(factoryBean);
	}
}
