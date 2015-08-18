package training.spring.autowireAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import training.spring.CurrencyConverter;
import training.spring.ExchangeService4;

public class CurrencyConverterImpl6a implements CurrencyConverter {
	
	public CurrencyConverterImpl6a() {
		System.out.println("CurrencyConverterImpl()");
	}
	
	
	
	private ExchangeService4 exchangeService;

	public ExchangeService4 getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	@Autowired
	@Qualifier("exchangeService1")
	public void setExchangeService(ExchangeService4 exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};