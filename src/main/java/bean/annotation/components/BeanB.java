package bean.annotation.components;

import myspring.util.MyUtil;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BeanB {
	String name = "BeanB";
	int random = MyUtil.getRandom();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

}
