package training.spring.schemaAOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	
	public void mybeforeMethod(JoinPoint jp) {
	Object arr[]=jp.getArgs();
	
	//BusinessImpl ob=(BusinessImpl) jp.getTarget();
	
	
	
	System.out.println(arr[0]+"from Advice");
				System.out.println("Before Method Call");
	}

	
	public void aroundMethod(ProceedingJoinPoint joinpoint) {
		System.out.println("Around (Before) Method Call");
	//	System.out.println(joinpoint.getArgs()[0]);
		BusinessImpl bp=(BusinessImpl)joinpoint.getTarget();
		bp.show();
		try{
		joinpoint.proceed();
		
		}catch(Throwable t){}
		
		System.out.println("Around (after) Method Call");
	}

	public void afterMethod(JoinPoint jp) {
		System.out.println(jp.getArgs()[0]);
		System.out.println("After Method Call");
	}
	public void afterMethodreturnresult(Object res) {
		System.out.println("Result is "+res.toString());
	}

	public void afterException( Exception err) {
		
			System.out.println("Message from Advice"+err.getMessage());
			
		
		
	}
}
