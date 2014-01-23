package bean.aware;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareImp implements BeanNameAware {
	String beanName;

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}

}
