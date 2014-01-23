package myspring.lifecycleMechanisms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.lifecycleMechanisms.BeanForLifecycle;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		//BeanForLifecycle bfl = (BeanForLifecycle) context.getBean("BeanForLifecycle");
		//System.out.println(bfl.getFlag());
		// context.start();
		// context.stop();
		context.registerShutdownHook();
	}
}
