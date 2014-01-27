package bean.annotation;

import org.springframework.beans.factory.annotation.Required;

public class BeanB {
	String string;

	public String getString() {
		return string;
	}

	@Required
	public void setString(String string) {
		this.string = string;
	}

}
