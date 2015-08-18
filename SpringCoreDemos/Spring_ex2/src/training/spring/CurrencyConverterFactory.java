package training.spring;
public class CurrencyConverterFactory {
	
	public CurrencyConverterFactory() {
		System.out.println("CurrencyConverterFactory()");
	}
	public CurrencyConverter getCurrencyConverter() {
		System.out.println("getCurrencyConverter()");
		
		return new CurrencyConverterImpl();
	}
}

