package training.spring.collection;
import java.util.List;

//import training.spring.mvc.*;

public class CurrencyConverterCollection {
	
	public CurrencyConverterCollection() {
		System.out.println("CurrencyConverterImpl()");
	}

	private List currencies;

	public List getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List currencies) {
		this.currencies = currencies;
	}

};