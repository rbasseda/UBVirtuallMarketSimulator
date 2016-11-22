/**
 * Phaneendra and Ashok
 */
package edu.bridgeport.cs441.vmarket;

import edu.bridgeport.cs441.vmarket.parties.Person;

/**
 *
 * Anything that can be purchased by one party and provided by the other one.
 * 
 * @author Reza Basseda
 *
 * 
 */
public interface Purchasable {
	
	/**
	 * This function simulates the trading process.
	 * 
	 * @param price    The price of purchased item
	 * @param reciever The party who receives the item
	 * @return         true if the trade was successful, false otherwise  
	 */
	
	boolean Purchased(int price, Person reciever);

}
