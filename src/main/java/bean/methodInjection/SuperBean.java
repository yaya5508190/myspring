package bean.methodInjection;

public abstract class SuperBean {
	protected BeanB beanB;

	public abstract BeanB getBeanB();

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
}
