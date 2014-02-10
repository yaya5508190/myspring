package bean.annotation.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
	@Bean@Scope("prototype")
	public TestBean getTestBean(){
		return new TestBean("FactoryMethodComponent");
	}
}
