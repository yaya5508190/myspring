package bean.lifecycleMechanisms;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements InitializingBean,DisposableBean{

	public void init(){
		System.out.println(2);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(1);
	}
	
	@PostConstruct
	public void annotationInit(){
		System.out.println(3);
	}

	public Bean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(4);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(5);
	}
	
	@PreDestroy
	public void annotationDes(){
		System.out.println(6);
	}
	
	public void des(){
		System.out.println(7);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}
}
