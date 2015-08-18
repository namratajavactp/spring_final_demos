package training.spring.annotation;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

import training.spring.CurrencyConverter;

public class CurrencyConverterClient9 {

	public static void main(String args[]) throws Exception {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");
		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverter");
		
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
