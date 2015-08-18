package training.spring;
import org.springframework.beans.factory.annotation.*;
public class TestRequiredAnnotation {
	
	private double exchangeRate;
public double getExchangeRate() {
	System.out.println("getExchangeRate()");		
	return exchangeRate;
}

@Required
public void setExchangeRate(double exchangeRate) {
	System.out.println("setExchangeRate()");		
	this.exchangeRate = exchangeRate;
}

public double dollarsToRupees(double dollars) {
	System.out.println("dollarsToRupees()");		
	return dollars * exchangeRate;
}
public TestRequiredAnnotation() {}
	
public TestRequiredAnnotation(double exchangeRate) {
	super();
	this.exchangeRate = exchangeRate;
}
}