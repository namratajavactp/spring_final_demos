package net.javabeat.spring.articles.txn.ticbook.pm;

import javax.sql.DataSource;

import net.javabeat.spring.articles.txn.Utils;

import org.springframework.context.ApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = Utils.getContext();
		
		TicketBookingServiceThroughPlatformManager service = new TicketBookingServiceThroughPlatformManager();
		
		DataSource dataSource = (DataSource)context.getBean("mySqlDataSource");
		service.setDataSource(dataSource);
		
		PlatformTransactionManager transactionManager = (PlatformTransactionManager)context.getBean("transactionManager");			
		service.setTransactionManager(transactionManager);		
		
		service.bookTicket(1, 2, 3);		
	}
}
