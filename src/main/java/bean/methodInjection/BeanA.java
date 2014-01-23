package bean.methodInjection;

public class BeanA extends SuperBean{

	@Override
	public BeanB getBeanB()  {
		return super.beanB;
	}
}
