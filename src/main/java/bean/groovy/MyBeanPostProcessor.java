package bean.groovy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.scripting.support.ScriptFactoryPostProcessor;

public class MyBeanPostProcessor extends ScriptFactoryPostProcessor{
	int i = 0;
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean "+(i++)+"'" + beanName + "' created : " + bean.toString());
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean "+(i++)+"'" + beanName + "' created : " + bean.toString());
		return bean;
	}

}
