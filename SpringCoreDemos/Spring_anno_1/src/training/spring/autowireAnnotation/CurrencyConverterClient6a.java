package training.spring.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.CurrencyConverter;


public class CurrencyConverterClient6a {

	public static void main(String args[]) throws Exception {
		ApplicationContext factory = new ClassPathXmlApplicationContext("currencyconverter6a.xml");
		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
