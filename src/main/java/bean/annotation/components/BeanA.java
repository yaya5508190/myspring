package bean.annotation.components;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

//如果不定义注解的value 则默认以注解所标识的字段 类或方法的名字首字母小写为名字
@Service
public class BeanA {
	BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	@Resource
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

}
