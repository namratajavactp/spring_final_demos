package training.spring.annotation;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import training.spring.CurrencyConverter;
//import training.spring.mvc.*;

@Component("currencyConverter")
public class CurrencyConverterImpl9 implements CurrencyConverter {
	
	@PostConstruct
	void init(){
		System.out.println("in init() - called thru @PostConstruct");
	}
	
	@PreDestroy
	void destroyyeyeh(){
		System.out.println("in destroy() - called thru @PreDestroy");
	}
	
	public CurrencyConverterImpl9() {
		System.out.println("CurrencyConverterImpl()");
	}
	@Autowired
	public CurrencyConverterImpl9(ExchangeServiceImpl9 exchangeService) {
		System.out.println("CurrencyConverterImpl() inside constructor");
		this.exchangeService = exchangeService;
	}
	
	
	private ExchangeServiceImpl9 exchangeService;

	public ExchangeServiceImpl9 getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	@Autowired
	public void setExchangeService(ExchangeServiceImpl9 exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	
	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};