package training.spring;

import java.util.Set;

public class ExchangeServiceImpl6 implements ExchangeService {

	public ExchangeServiceImpl6() {
		System.out.println("ExchangeServiceImpl()");
	}
	public double getExchangeRate() {
	
		System.out.println("getExchangeRate()");
		return 44.25;
	}
}
