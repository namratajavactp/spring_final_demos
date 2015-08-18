package training.spring;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	protected CurrencyConverterImpl() {
		System.out.println("constructor");
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
		return dollars * exchangeRate++;

	}
};