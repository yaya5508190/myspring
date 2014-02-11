package bean.javaBaseConfig;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
	String string = "BeanC";

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
