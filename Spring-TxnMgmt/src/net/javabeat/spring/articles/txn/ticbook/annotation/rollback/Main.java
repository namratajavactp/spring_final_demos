package net.javabeat.spring.articles.txn.ticbook.annotation.rollback;

import net.javabeat.spring.articles.txn.BookingService;
import net.javabeat.spring.articles.txn.Utils;

import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = Utils.getContext("main-annotation.xml");
		
		BookingService service = (BookingService)context.getBean("ticketBookingServiceThroughAnnotationRollback");
		service.bookTicket(1, 1, 1);
	}
}
