package com.madhu.springAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
        @SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("spring2.xml");
       // Question ans=(Question)context.getBean("q1");
      //  Question ans=(Question)context.getBean("q2");
        Question ans=(Question)context.getBean("q3");
    	ans.questionInfo();
    }
}
