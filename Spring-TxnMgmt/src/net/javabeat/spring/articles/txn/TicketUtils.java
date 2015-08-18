package net.javabeat.spring.articles.txn;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.map.ListOrderedMap;
import org.springframework.jdbc.core.JdbcTemplate;

public class TicketUtils {

	@SuppressWarnings("unchecked")
	public static int getAccountId(JdbcTemplate template, int userId){

		String sql = "select * from user where id = '" + userId + "'";
		List userList= template.queryForList(sql);

		int accountId = -1;
		for (Object userObject : userList){
			if (userObject instanceof ListOrderedMap){
				
				ListOrderedMap map = (ListOrderedMap)userObject;
				Iterator<Object> iterator = map.keySet().iterator();
				while (iterator.hasNext()){
					
					Object key = iterator.next();
					Object value = map.get(key);
					if (key.equals("account_id")){
						accountId = Integer.parseInt(value.toString());
					}
					System.out.println("Key - " + key + ", Value - " + value);
				}
			}
		}	
		return accountId;
	}
	
	@SuppressWarnings("unchecked")
	public static float findTicketCost(JdbcTemplate template, int ticketId){

		String sql = "select * from movie_ticket where id = '" + ticketId + "'";
		List userList= template.queryForList(sql);

		float ticketCost = 0;
		for (Object userObject : userList){
			if (userObject instanceof ListOrderedMap){
				
				ListOrderedMap map = (ListOrderedMap)userObject;
				Iterator<Object> iterator = map.keySet().iterator();
				while (iterator.hasNext()){
					
					Object key = iterator.next();
					Object value = map.get(key);
					if (key.equals("price")){
						ticketCost = Float.parseFloat(value.toString());
					}
					System.out.println("Key - " + key + ", Value - " + value);
				}
			}
		}	
		return ticketCost;
		
	}

	public static void deductMoneyFromAccount(JdbcTemplate template, int accountId, float amount){

		String sql = "update account set amount = (amount - " + amount + ") where id = " + accountId + "";
		template.execute(sql);		
		
	}

	
	public static void reduceTicketCount(JdbcTemplate template, int ticketId, int noOfTickets){

		String sql = "update movie_ticket set tickets_count = (tickets_count - " + noOfTickets + ") where id = " + ticketId + "";
		template.execute(sql);
	}

	public static int balanceMoney(JdbcTemplate template, int accountId){
		String sql = "select amount from account where id = '" + accountId + "'";
		return template.queryForInt(sql);
	}

}
