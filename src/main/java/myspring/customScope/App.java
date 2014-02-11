package myspring.customScope;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author Alucard
 * SimpleThreadScope does not support descruction callbacks. Consider using a RequestScope in a Web environment.
 */
public class App {
	public static void main(String[] args) {
		//手动把context传入线程 不灵活
		/*ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		MyThread thread = new MyThread(context);
		
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);
		Thread t3 = new Thread(thread);
		
		t1.start();
		t2.start();
		t3.start();*/
		
		//直接将对象注入到线程内部 推荐 更符合spring的风格
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		MyThread1 t1 = (MyThread1) context.getBean("myThread1");
		MyThread1 t2 = (MyThread1) context.getBean("myThread1");
		MyThread1 t3 = (MyThread1) context.getBean("myThread1");
		System.out.println(t1.getBean()==t2.getBean());
		System.out.println(t2.getBean()==t3.getBean());
		System.out.println(t1.getBean()==t3.getBean());
		t1.start();
		t2.start();
		t3.start();
	}
}
