package training.spring;
public class CurrencyConverterImpl4 implements CurrencyConverter {
	
	public CurrencyConverterImpl4() {
		System.out.println("from constructor CurrencyConverterImpl()");
	}

	private ExchangeService4 exchangeService;

	public ExchangeService4 getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	public void setExchangeService(ExchangeService4 exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};