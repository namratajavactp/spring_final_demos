package net.javabeat.spring.articles.txn.ticbook.aop;

import net.javabeat.spring.articles.txn.TicketUtils;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class TicketBookingServiceThroughAop extends JdbcDaoSupport{

	public void bookTicket(int userId, int ticketId, int noOfTickets){

		int accountId = TicketUtils.getAccountId(getJdbcTemplate(), userId);
		
		float ticketCost = TicketUtils.findTicketCost(getJdbcTemplate(), ticketId);		
		float totalCost = (noOfTickets * ticketCost);
		
		TicketUtils.deductMoneyFromAccount(getJdbcTemplate(), accountId, totalCost); 		
		TicketUtils.reduceTicketCount(getJdbcTemplate(), ticketId, noOfTickets);
		
	}
}
