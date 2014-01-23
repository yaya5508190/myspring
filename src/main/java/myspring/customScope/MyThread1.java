package myspring.customScope;

import bean.customScope.Bean;

public class MyThread1 extends Thread {
	Bean bean;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(bean.getI());
	}
	public Bean getBean() {
		return bean;
	}
	public void setBean(Bean bean) {
		this.bean = bean;
	}
}
