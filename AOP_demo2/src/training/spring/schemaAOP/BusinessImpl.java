package training.spring.schemaAOP;

import org.aspectj.lang.JoinPoint;

import training.spring.aop.Business;

import training.spring.aop.*;
public class BusinessImpl implements Business {
	 
    public void doBusiness() {
    	
            System.out.println("I do what I do best, i.e sleep.");
            try {
                    Thread.sleep(2000);
            } catch (InterruptedException e) {
                    System.out.println("How dare you to wake me up?");
            }
            System.out.println("Done with sleeping.");
    }

public String getName(String name){
	
	System.out.println(name+">>>>>>");
	return name.toUpperCase();
}

public void testBusinessException(String name)throws User_Exception {
	if(!name.equals("nama"))
	throw new User_Exception("User name not ali");
	System.out.println("within Businessclass");
	
}
void show(){
	
	System.out.println("hello i am not in service contract");
}

}
