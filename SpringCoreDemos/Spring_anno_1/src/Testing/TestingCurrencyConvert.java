package Testing;
import static org.junit.Assert.*; 
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import training.spring.autowireAnnotation.CurrencyConverterImpl6a;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("currencyconverter6a.xml")
@Transactional
public class TestingCurrencyConvert {
	
	public TestingCurrencyConvert() {
		
	}

	@Autowired
	private CurrencyConverterImpl6a currencyConverter;
	
	@Test
	void testDollartoRupees(){
	assertEquals(2212.5,currencyConverter.dollarsToRupees(50));
	}
}
