package myspring.methodInjection;

import myspring.util.MyUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.methodInjection.SuperBean;

/**
 * 方法注入测试
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) MyUtil.getContext();
    	testEqual(context,"superBean");
    	testEqual(context,"beanA");
    	testEqual(context,"proxyBeanA");
    }
    
    public static void testEqual(ClassPathXmlApplicationContext context,String beanName){
    	SuperBean SuperBean1 = (SuperBean) context.getBean(beanName);
    	SuperBean SuperBean2 = (SuperBean) context.getBean(beanName);
    	System.out.println(SuperBean1.getBeanB()==SuperBean2.getBeanB()); 
    	SuperBean1.getBeanB().showRandom();
    	SuperBean2.getBeanB().showRandom();
    }
}