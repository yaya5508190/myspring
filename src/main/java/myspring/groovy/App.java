package myspring.groovy;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.groovy.Messenger;

public final class App {
	public static void main(final String[] args) throws Exception {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext("bean/groovy/context.xml");
		Messenger messenger = (Messenger) context.getBean("mymessenger");
		for(int i=0;i<10000;i++){			
			System.out.println(messenger.getMessage());
			Thread.sleep(500);
		}
	}
}
