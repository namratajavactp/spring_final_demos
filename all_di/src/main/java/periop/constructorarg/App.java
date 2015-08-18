package periop.constructorarg;

import java.io.FileInputStream;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructordi.constructorarg.*;

public class App
{
	public static void main(String[] args) 
	{
		try
		{
			//following line is traditional way of creating an Employee
			//Employee emp = new Employee("Amit");
			ApplicationContext context = new ClassPathXmlApplicationContext("employees.xml");
			
			
            Employee emp = (Employee) context.getBean("emloyee");

			System.out.println("The name of created Employee is :: "+ emp.getFirstname());
			
			System.out.println("The month of  Employee's birthdate is :: "+ emp.getD().getMonth());
			
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
}