package bean.customEvent;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {
	private final String email;
	private final String text;
	
	public BlackListEvent(Object source,String email,String text) {
		super(source);
		// TODO Auto-generated constructor stub
		this.email = email;
		this.text = text;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+email+"]["+text+"]";
	}
}
