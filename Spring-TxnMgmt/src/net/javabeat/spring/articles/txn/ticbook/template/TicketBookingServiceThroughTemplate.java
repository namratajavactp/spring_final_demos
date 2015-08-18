package net.javabeat.spring.articles.txn.ticbook.template;

import net.javabeat.spring.articles.txn.TicketUtils;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class TicketBookingServiceThroughTemplate extends JdbcDaoSupport{

	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager transactionManager){
		this.transactionManager = transactionManager;
	}
	
	public void bookTicket(int userId, int ticketId, int noOfTickets){

		TransactionTemplate template = new TransactionTemplate(transactionManager);
	
		BookingTransactionCallback callback = 
			new BookingTransactionCallback(this, userId, ticketId, noOfTickets);		
		template.execute(callback);
		
	}
}

class BookingTransactionCallback extends TransactionCallbackWithoutResult{

	private JdbcDaoSupport daoSupport;
	private int userId;
	private int ticketId;
	private int noOfTickets;

	public BookingTransactionCallback(JdbcDaoSupport daoSupport, int userId, int ticketId, int noOfTickets){
		
		this.daoSupport = daoSupport;
		this.userId = userId;
		this.ticketId = ticketId;
		this.noOfTickets = noOfTickets;
	}

	@Override
	protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
		
		int accountId = TicketUtils.getAccountId(daoSupport.getJdbcTemplate(), userId);
		
		float ticketCost = TicketUtils.findTicketCost(daoSupport.getJdbcTemplate(), ticketId);		
		float totalCost = (noOfTickets * ticketCost);
		
		TicketUtils.deductMoneyFromAccount(daoSupport.getJdbcTemplate(), accountId, totalCost); 		
		TicketUtils.reduceTicketCount(daoSupport.getJdbcTemplate(), ticketId, noOfTickets);
		
	}
		
}