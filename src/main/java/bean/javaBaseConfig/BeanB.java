package bean.javaBaseConfig;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
	String string = "BeanB";

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
