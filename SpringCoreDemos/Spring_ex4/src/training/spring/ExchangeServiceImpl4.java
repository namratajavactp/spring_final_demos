package training.spring;

public class ExchangeServiceImpl4 implements ExchangeService4 {

	public ExchangeServiceImpl4() {
		System.out.println("ExchangeServiceImpl()");
	}
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return 44.25;
	}
}
