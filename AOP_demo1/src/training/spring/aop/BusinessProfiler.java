package training.spring.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BusinessProfiler {
 
        @Pointcut("execution(* training.spring.aop.*.*(..))")
        public void pointcut2() { }
        
        @Pointcut("execution(* training.spring.aop.BusinessImpl.test(..))")
        public void pointcut1() { }
 
      /*  @Around("pointcut2()")
        public Object profile(ProceedingJoinPoint pjp) throws Throwable {
                long start = System.currentTimeMillis();
               Object arr[]= pjp.getArgs();
           int x=(Integer)arr[0];
           System.out.println(x);
           BusinessImpl ob= (BusinessImpl) pjp.getTarget();
           System.out.println("Changed Name"+ob.name);
                System.out.println("Going to call the method.");
                Object output = pjp.proceed();
                System.out.println("Method execution completed.");
                System.out.println("Changed Name"+ob.name);
                long elapsedTime = System.currentTimeMillis() - start;
                System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
                return output;
        }*/
       /* @After("pointcut1()")
        void Show()
        {
        	System.out.println("hi i am in after advice");
        }
        */
        @Before("pointcut2()")
        public void MyBeforeMethod(JoinPoint p){
        	
        	Integer data=(Integer)p.getArgs()[0];
        System.out.println(data.intValue());
        	System.out.println("Applying Before advice");
        }
 
}