package myspring.validator;

import java.util.List;

import myspring.util.MyUtil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

import bean.validator.CustomValidator;
import bean.validator.Person;
import bean.validator.TestBean;

public class App {
	public static void main(String[] args) {
		/*CustomValidator validator = new CustomValidator();
		Person person = new Person();
		TestBean bean = new TestBean();
		//bean.setName("123");
		person.setBean(bean);
		Errors errors = new BeanPropertyBindingResult(person, "person");
		validator.validate(person, errors);
		List list = errors.getAllErrors();
		DefaultMessageCodesResolver res = new DefaultMessageCodesResolver();
		res.resolveMessageCodes("name.empty", "person");
		res.setPrefix("123");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(((ObjectError)list.get(i)).getCode());
		}*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("bean.validator");
		context.refresh();
		CustomValidator validator = (CustomValidator) context.getBean("validator");
		DefaultMessageCodesResolver res = (DefaultMessageCodesResolver) context.getBean("resolver");
		Person person = new Person();
		Errors errors = new BeanPropertyBindingResult(person, "person");
		validator.validate(person, errors);
		List list = errors.getAllErrors();
		for (int i = 0; i < list.size(); i++) {
			for(String s : res.resolveMessageCodes(((ObjectError)list.get(i)).getCode(), "persion", "name", String.class))
			System.out.println(s);
		}
	}
}
