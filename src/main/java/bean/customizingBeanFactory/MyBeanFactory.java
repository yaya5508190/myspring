package bean.customizingBeanFactory;

import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory implements FactoryBean<String>{

	@Override
	public String getObject() throws Exception {
		// TODO Auto-generated method stub
		return "1";
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
