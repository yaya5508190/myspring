package myspring.lifecycleMechanisms;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.lifecycleMechanisms.BeanForLifecycle;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		BeanForLifecycle bfl = (BeanForLifecycle) context.getBean("BeanForLifecycle");
		System.out.println(bfl.getFlag());
		context.start();
		context.stop();
		context.registerShutdownHook();
	}
}
