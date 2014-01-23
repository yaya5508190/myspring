package myspring.customScope;

import org.springframework.context.ApplicationContext;

import bean.customScope.Bean;

public class MyThread extends Thread {
	ApplicationContext context;
	public MyThread(ApplicationContext context) {
		super();
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Bean bean =  (Bean) context.getBean("threadScopeBean");
		System.out.println(bean.getI());
	}
}
