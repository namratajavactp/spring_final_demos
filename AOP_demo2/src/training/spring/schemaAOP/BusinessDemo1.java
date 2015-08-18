package training.spring.schemaAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.aop.Business;
 
public class BusinessDemo1 {
 
        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("schemaaop.xml");
                Business bc = (Business) context.getBean("myBusinessClass");
                bc.doBusiness();
              //bc.getName("ali");
             // System.out.println(bc.getName("aniket"));
                /*try {
					bc.testBusinessException("alid");
				} catch (User_Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}*/
        }
}