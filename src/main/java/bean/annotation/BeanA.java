package bean.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}
	
	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

}
