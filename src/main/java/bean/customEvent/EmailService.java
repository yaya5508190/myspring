package bean.customEvent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EmailService implements ApplicationEventPublisherAware {
	List<String> blackList = new ArrayList<String>();
	ApplicationEventPublisher applicationEventPublisher;

	public void sendEmail(String email, String text) {
		if(blackList.contains(email)){
			BlackListEvent event = new BlackListEvent(this, email, text);
			applicationEventPublisher.publishEvent(event);
			return;
		}
		System.out.println("send to "+email+" success");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}

}
