package training.spring;
public class CurrencyConverterImpl3 implements CurrencyConverter {
	
	public CurrencyConverterImpl3(double exchangeRate) {
		System.out.println("CurrencyConverterImpl()");
		this.exchangeRate = exchangeRate;
	}

	private double exchangeRate;

	public double getExchangeRate() {
		System.out.println("getExchangeRate()");		
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate()");		
		this.exchangeRate = exchangeRate;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeRate;
	}
};