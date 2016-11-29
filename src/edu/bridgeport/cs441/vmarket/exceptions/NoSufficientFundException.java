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
public NoSufficientFundException (double amount){
  this.amount=amount;
  System.out.println("Insufficient funds in the account of transaction. "+amount+" of currency is required");
}
  public double getAmount(){
  return amount;
  }
}
