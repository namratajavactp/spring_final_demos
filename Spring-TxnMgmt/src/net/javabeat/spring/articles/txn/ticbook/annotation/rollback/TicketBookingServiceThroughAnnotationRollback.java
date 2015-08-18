package net.javabeat.spring.articles.txn.ticbook.annotation.rollback;

import net.javabeat.spring.articles.txn.BookingService;
import net.javabeat.spring.articles.txn.TicketUtils;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class TicketBookingServiceThroughAnnotationRollback extends JdbcDaoSupport implements BookingService{

	@Transactional(rollbackFor = {InsufficientFundsException.class})
	public void bookTicket(int userId, int ticketId, int noOfTickets){

		int accountId = TicketUtils.getAccountId(getJdbcTemplate(), userId);
		
		float ticketCost = TicketUtils.findTicketCost(getJdbcTemplate(), ticketId);		
		float totalCost = (noOfTickets * ticketCost);
		
		TicketUtils.deductMoneyFromAccount(getJdbcTemplate(), accountId, totalCost); 		
		int balanceAmount = TicketUtils.balanceMoney(getJdbcTemplate(), accountId);
		if (balanceAmount <= 0){
			throw new InsufficientFundsException("Insufficient Funds");
		}
		
		TicketUtils.reduceTicketCount(getJdbcTemplate(), ticketId, noOfTickets);		
	}

}
