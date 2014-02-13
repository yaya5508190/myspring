package bean.customEvent;

import javax.annotation.Resource;

import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
	private String notifierEmail;
	private EmailService emailService;
	
	@Override
	public void onApplicationEvent(BlackListEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event);
		emailService.sendEmail(notifierEmail, event+"is in black list");
	}
	public void setNotifierEmail(String notifierEmail) {
		this.notifierEmail = notifierEmail;
	}
	
	@Resource
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	
}
