package myspring.javaBaseConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import bean.javaBaseConfig.AppConfig;
import bean.javaBaseConfig.AppConfig;
import bean.javaBaseConfig.BeanA;
import bean.javaBaseConfig.BeanB;
import bean.javaBaseConfig.ImportConfig;
import bean.javaBaseConfig.MyBean;
import bean.javaBaseConfig.RandomBean;
import bean.javaBaseConfig.TwiceConfig;

public class App {
	public static void main(String[] args) {
		//scanner形式
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("bean.javaBaseConfig");
		context.refresh();
		BeanA bean = (BeanA) context.getBean("beanA");
		System.out.println(bean.getBeanB());*/
		//指定配置class形式
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBean bean = (MyBean) context.getBean("getBean");
		System.out.println(bean);*/
		//register形式
		//如果两个配置文件有相同名字的bean则以主配置文件为准 同时导入则以后面一个为准
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ImportConfig.class);
		context.refresh();
		MyBean bean1 = (MyBean) context.getBean("getBean");
		MyBean bean2 = (MyBean) context.getBean("getMyBean");
		System.out.println(bean1.getName());
		System.out.println(bean2.getName());*/
		//测试两次调用bean
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TwiceConfig.class);
		RandomBean bean1 = (RandomBean) context.getBean("getBean1");
		RandomBean bean2 = (RandomBean) context.getBean("getBean2");
		System.out.println(bean1.getBean() == bean2.getBean());
	}
}
