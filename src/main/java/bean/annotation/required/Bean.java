package bean.annotation.required;

import org.springframework.beans.factory.annotation.Required;

public class Bean {
	String string;

	public String getString() {
		return string;
	}

	@Required
	public void setString(String string) {
		this.string = string;
	}

}
