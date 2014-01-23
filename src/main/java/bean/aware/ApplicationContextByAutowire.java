package bean.aware;

import org.springframework.context.ApplicationContext;

public class ApplicationContextByAutowire {
	ApplicationContext context;

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

}
