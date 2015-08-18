package net.javabeat.spring.articles.txn.ticbook;

import net.javabeat.spring.articles.txn.Utils;

import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		
		JdbcTemplate template = Utils.jdbcTempalte();
		
		TicketBookingService service = new TicketBookingService();
		service.setTemplate(template);
		
		service.bookTicket(1, 1, 1);
	}
}
