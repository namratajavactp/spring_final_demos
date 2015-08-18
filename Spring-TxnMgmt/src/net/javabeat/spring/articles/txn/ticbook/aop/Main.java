package net.javabeat.spring.articles.txn.ticbook.aop;

import net.javabeat.spring.articles.txn.Utils;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = Utils.getContext();

		TicketBookingServiceThroughAop service = (TicketBookingServiceThroughAop)context.getBean("ticketBookingServiceThroughAop");		
		service.bookTicket(1, 1, 1);		
	}
}
