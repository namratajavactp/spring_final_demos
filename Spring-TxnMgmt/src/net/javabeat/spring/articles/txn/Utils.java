package net.javabeat.spring.articles.txn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Utils {

	static ApplicationContext context = null;
	
	public static JdbcTemplate jdbcTempalte(){		
	
		initContext();
		DriverManagerDataSource dataSource = (DriverManagerDataSource)context.getBean("mySqlDataSource");
		System.out.println("Data source is " + dataSource);
				
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template;
	}
	
	public static ApplicationContext getContext(){
		
		initContext();
		return context;
	}

	public static ApplicationContext getContext(String configFilename){
		
		return new ClassPathXmlApplicationContext(configFilename);
	}

	private static void initContext(){
		
		if (context == null){
			context = new ClassPathXmlApplicationContext("main.xml");
		}
	}

}
