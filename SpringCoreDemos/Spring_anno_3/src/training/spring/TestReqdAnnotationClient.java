package training.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestReqdAnnotationClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("TestRequiredAnnotation.xml");
		TestRequiredAnnotation curr = (TestRequiredAnnotation) ctx.getBean("currencyConverter");
			double rupees = curr.dollarsToRupees(50.0);
			System.out.println("50 $ is "+rupees+" Rs.");
		}
	}

