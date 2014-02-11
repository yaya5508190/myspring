package bean.myBeanNameGenerator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class MyBeanNameGenerator implements BeanNameGenerator {

	@Override
	public String generateBeanName(BeanDefinition definition,BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println(definition.getBeanClassName());
		System.out.println(registry.getBeanDefinitionCount());
		return definition.getBeanClassName();
	}

}
