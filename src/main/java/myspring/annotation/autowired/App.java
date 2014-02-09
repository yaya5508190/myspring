package myspring.annotation.autowired;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.annotation.autowired.BeanA;
import bean.annotation.autowired.BeanB;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
		BeanA beanA = (BeanA) context.getBean("autowiredBeanA");
		System.out.println(beanA.getBeanB().getString());
		System.out.println(beanA.getBeanC().getString());
		System.out.println(beanA.getBeanD().getString());
		System.out.println("--------------------------");
		BeanB[] beanBArray = beanA.getBeanBArray();
		Set<BeanB> beanBSet = beanA.getBeanBSet();
		Map<String, BeanB> beanBMap = beanA.getBeanBMap();
		
		for(BeanB beanB: beanBArray){
			System.out.println(beanB.getString());
		}
		System.out.println("--------------------------");
		Iterator<BeanB> itSetBeanB = beanBSet.iterator();
		while(itSetBeanB.hasNext()){
			System.out.println(itSetBeanB.next().getString());
		}
		System.out.println("--------------------------");
		Set<String> set = beanBMap.keySet();
		Iterator<String> itMapBeanB = set.iterator();
		while(itMapBeanB.hasNext()){
			String beanName = itMapBeanB.next();
			System.out.println(beanName);
			System.out.println(beanBMap.get(beanName));
		}
	}
}
