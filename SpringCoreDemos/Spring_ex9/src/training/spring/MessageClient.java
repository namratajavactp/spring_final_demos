package training.spring;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageClient {

	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("message.xml");
		MessageSource messageSource = (MessageSource) ctx.getBean("messageSource");
		Locale locale = new Locale("en","US");
		String msg = messageSource.getMessage("welcome.message",new Object[]{"Hi","Majrul"},locale);
		System.out.println(msg);
	}
}
