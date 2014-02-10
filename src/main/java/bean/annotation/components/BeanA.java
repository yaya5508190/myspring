package bean.annotation.components;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("beanA")
public class BeanA {
	BeanB bean;

	public BeanB getBean() {
		return bean;
	}
	
	@Resource
	public void setBean(BeanB bean) {
		this.bean = bean;
	}
}
