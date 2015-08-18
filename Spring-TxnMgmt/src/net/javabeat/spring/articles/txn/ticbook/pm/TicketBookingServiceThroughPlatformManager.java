package net.javabeat.spring.articles.txn.ticbook.pm;

import net.javabeat.spring.articles.txn.TicketUtils;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TicketBookingServiceThroughPlatformManager extends JdbcDaoSupport{

	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager transactionManager){
		this.transactionManager = transactionManager;
	}
	
	public void bookTicket(int userId, int ticketId, int noOfTickets){
		
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(transactionDefinition);
		
		try{						
			int accountId = TicketUtils.getAccountId(getJdbcTemplate(), userId);
			
			float ticketCost = TicketUtils.findTicketCost(getJdbcTemplate(), ticketId);		
			float totalCost = (noOfTickets * ticketCost);
			
			TicketUtils.deductMoneyFromAccount(getJdbcTemplate(), accountId, totalCost); 		
			TicketUtils.reduceTicketCount(getJdbcTemplate(), ticketId, noOfTickets);
			
			transactionManager.commit(status);
		}catch (Exception e){
			transactionManager.rollback(status);
		}
		
	}
}
