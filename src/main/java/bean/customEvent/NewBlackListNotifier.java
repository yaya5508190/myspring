package bean.customEvent;

import org.springframework.context.ApplicationListener;

public class NewBlackListNotifier implements ApplicationListener<BlackListEvent> {
	@Override
	public void onApplicationEvent(BlackListEvent event) {
		// TODO Auto-generated method stub
		System.out.println("New Listener" + event);
	}
}
