/**
 * 
 */
package com.praveen.examples.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author USER
 *
 */
public class SpringController {
public static void main(String []args){
	ClassPathXmlApplicationContext contxt = new  ClassPathXmlApplicationContext("Spring.xml");
	Message a =(Message) contxt.getBean("hello");
	System.out.println(a.getMessage());
	contxt.close();
}
}
