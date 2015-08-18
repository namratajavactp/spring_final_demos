package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class CurrencyConverterClient2 {

	public static void main(String args[]) throws Exception {
		Resource res = new ClassPathResource("currencyconverter2.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.  [hashcode :"+curr.hashCode()+"]");
		CurrencyConverter curr2 = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees2 = curr2.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees2+" Rs.   [hashcode :"+curr2.hashCode()+"]");
	}
}
