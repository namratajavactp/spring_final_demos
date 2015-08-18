package net.javabeat.spring.articles.txn.ticbook;

import java.sql.Connection;
import net.javabeat.spring.articles.txn.TicketUtils;

import org.springframework.jdbc.core.JdbcTemplate;

public class TicketBookingService {

	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}
	
	public void bookTicket(int userId, int ticketId, int noOfTickets){
				
		Connection connection = null;
		try{
			connection = template.getDataSource().getConnection();
			connection.setAutoCommit(false);
			
			int accountId = TicketUtils.getAccountId(template, userId);
			
			float ticketCost = TicketUtils.findTicketCost(template, ticketId);		
			float totalCost = (noOfTickets * ticketCost);
			
			TicketUtils.deductMoneyFromAccount(template, accountId, totalCost); 		
			TicketUtils.reduceTicketCount(template, ticketId, noOfTickets);
			connection.commit();
		}catch (Exception exception){
			exception.printStackTrace();
			
			if (connection != null){
				try{
					connection.rollback();									
				}catch (Exception e1){
					e1.printStackTrace();
				}
			}
		}
	}
	
}
