/**
 * 
 */
package edu.bridgeport.cs441.vmarket.exceptions;

/**
 * @author Reza Basseda
 *
 */
public class NoSufficientFundException extends Exception {
private double amount;
public NoSufficientFundException (){
	super("Insufficient fund");
}

}
