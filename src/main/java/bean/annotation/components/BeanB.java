package bean.annotation.components;

import org.springframework.stereotype.Repository;

@Repository("bean")
public class BeanB {
	String name = "BeanB";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
