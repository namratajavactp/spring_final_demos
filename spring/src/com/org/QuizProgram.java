package com.org;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class QuizProgram {
	
	 public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*ApplicationContext context2=new FileSystemXmlApplicationContext("D:\\CColon\\beans.xml");
		System.out.println(
				(context.getBean("quizMasterService"))
				.equals(
						(context2.getBean("quizMasterService"))));*/
		QuizMasterService quizMasterService = (QuizMasterService) context.getBean("quizMasterService");
		
		
		quizMasterService.askQuestion();
	}

}
