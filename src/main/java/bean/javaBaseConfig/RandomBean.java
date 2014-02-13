package bean.javaBaseConfig;

import myspring.util.MyUtil;

public class RandomBean {
	int i = MyUtil.getRandom();
	RandomBean bean;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public RandomBean getBean() {
		return bean;
	}

	public void setBean(RandomBean bean) {
		this.bean = bean;
	}

}
