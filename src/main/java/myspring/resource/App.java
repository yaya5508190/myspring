package myspring.resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.resource.BeanA;

public class App {
/*	in general you should avoid it, because it couples the code to Spring and does not follow the Inversion of Control style*/
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext的后一个class参数是为了指定路径用的
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:D:/GitHub/myspring/src/main/java/bean/resource/context.xml");
		BeanA beanA = (BeanA) context.getBean("BeanA");
		System.out.println(beanA.getName());
	}
}
