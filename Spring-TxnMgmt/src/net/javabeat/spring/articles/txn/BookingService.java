package net.javabeat.spring.articles.txn;

public interface BookingService {

	void bookTicket(int userId, int ticketId, int noOfTickets);
	
}
