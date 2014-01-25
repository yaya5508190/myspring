package myspring.inheritance;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.inheritance.Child;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		Child child = (Child) context.getBean("inheritanceChild");
		System.out.println("child----"+child.getName());
	}
}
