package bean.javaBaseConfig;

import org.springframework.stereotype.Component;

@Component
public class BeanD {
	String string = "BeanD";

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
