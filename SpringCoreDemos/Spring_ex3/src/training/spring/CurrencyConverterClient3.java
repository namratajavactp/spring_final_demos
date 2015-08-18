package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class CurrencyConverterClient3 {

	public static void main(String args[]) throws Exception {
		Resource res = new ClassPathResource("currencyconverter3.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
