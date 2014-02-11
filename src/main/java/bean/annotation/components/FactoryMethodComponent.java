package bean.annotation.components;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
	private static int i;

	@Bean
	@Qualifier("public")
	public TestBean publicInstance() {
		return new TestBean("publicInstance");
	}

	// use of a custom qualifier and autowiring of method parameters

	@Bean
	protected TestBean protectedInstance(@Qualifier("public") TestBean spouse,@Value("#{privateInstance.age}") String country) {
		TestBean tb = new TestBean("protectedInstance", 1);
		tb.setSpouse(spouse);
		tb.setCountry(country);
		return tb;
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_SINGLETON)
	private TestBean privateInstance(@Qualifier("randomInstance")TestBean testBean) {
		TestBean tb = new TestBean("privateInstance", 100);
		tb.setSpouse(testBean);
		return tb;
	}

	@Bean
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
	private TestBean randomInstance() {
		Random random = new Random();
		return new TestBean("randomInstance", random.nextInt(100));
	}
}
