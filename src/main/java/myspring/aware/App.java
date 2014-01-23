package myspring.aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.aware.ApplicationContextAwareImp;
import bean.aware.ApplicationContextByAutowire;
import bean.aware.BeanNameAwareImp;

public class App {
/*	in general you should avoid it, because it couples the code to Spring and does not follow the Inversion of Control style*/
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ApplicationContextAwareImp acai = (ApplicationContextAwareImp) context.getBean("applicationContextAwareImp");
		ApplicationContextByAutowire acba = (ApplicationContextByAutowire) context.getBean("applicationContextAuto");
		BeanNameAwareImp bnai = (BeanNameAwareImp) context.getBean("beanNameAwareImp");
		
		System.out.println(acai.getContext());
		/*通过autowire注入context*/
		System.out.println(acba.getContext());
		System.out.println(bnai.getBeanName());
	}
}
