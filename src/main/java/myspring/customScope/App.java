package myspring.customScope;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		/*ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		MyThread thread = new MyThread(context);
		
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);
		Thread t3 = new Thread(thread);
		
		t1.start();
		t2.start();
		t3.start();*/
		
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		Thread t1 = (Thread) context.getBean("myThread1");
		Thread t2 = (Thread) context.getBean("myThread1");
		Thread t3 = (Thread) context.getBean("myThread1");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
