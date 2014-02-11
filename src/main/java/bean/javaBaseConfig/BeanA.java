package bean.javaBaseConfig;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BeanA {
	BeanB beanB;
	BeanC beanC;
	BeanD beanD;
	BeanB[] beanBArray;
	Set<BeanB> beanBSet;
	Map<String, BeanB> beanBMap;
	public BeanA() {
	}

	@Autowired
	//当容器里有多个类型相同的bean时用@Qualifier来区分
	public BeanA(BeanB beanB, BeanC beanC, BeanD beanD) {
		super();
		this.beanB = beanB;
		this.beanC = beanC;
		this.beanD = beanD;
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanC getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

	public BeanB[] getBeanBArray() {
		return beanBArray;
	}

	@Autowired
	public void setBeanBArray(BeanB[] beanBArray) {
		this.beanBArray = beanBArray;
	}

	public Set<BeanB> getBeanBSet() {
		return beanBSet;
	}

	@Autowired
	public void setBeanBSet(Set<BeanB> beanBSet) {
		this.beanBSet = beanBSet;
	}

	public Map<String, BeanB> getBeanBMap() {
		return beanBMap;
	}

	@Autowired
	public void setBeanBMap(Map<String, BeanB> beanBMap) {
		this.beanBMap = beanBMap;
	}
	
	
}
