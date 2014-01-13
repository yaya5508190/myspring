package myspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.BeanA;
import bean.SuperBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
    	testEqual(context,"beanA");
    	testEqual(context,"beanAWithoutLookUp");
    }
    
    public static void testEqual(ClassPathXmlApplicationContext context,String beanName){
    	SuperBean SuperBean1 = (SuperBean) context.getBean(beanName);
    	SuperBean SuperBean2 = (SuperBean) context.getBean(beanName);
    	System.out.println(SuperBean1.getBeanB()==SuperBean2.getBeanB()); 
    	SuperBean1.getBeanB().showRandom();
    	SuperBean2.getBeanB().showRandom();
    }
}