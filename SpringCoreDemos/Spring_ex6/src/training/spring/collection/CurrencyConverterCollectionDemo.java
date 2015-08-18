package training.spring.collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

//import training.spring.mvc.*;

public class CurrencyConverterCollectionDemo {

	public static void main(String args[]) throws Exception {
		Resource res = new ClassPathResource("collection.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		CurrencyConverterCollection curr = (CurrencyConverterCollection) factory.getBean("currencyList");
		List<String> currencies = curr.getCurrencies();
		Iterator<String> it = currencies.iterator();
		System.out.println("Currencies supported :");
		while (it.hasNext())
		   System.out.println(it.next());
		
	}
}
