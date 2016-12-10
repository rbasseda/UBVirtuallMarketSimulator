package edu.bridgeport.cs441.vmarket.parties;

/**
 * @author Reza Basseda, Jay Sheth
 *
 */

// test change for Beans file (not main class but for checking with beans)

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tempMain {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("MarketMembers.xml");

	      Shopper objA = (Shopper) context.getBean("helloWorld");

	      objA.getfName();
	      objA.getlName();
	      
	     
	   }
	
}