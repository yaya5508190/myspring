package bean;

public class BeanAWithoutLookUp extends SuperBean{

	@Override
	public BeanB getBeanB()  {
		return super.beanB;
	}
}
