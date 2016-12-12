package edu.bridgeport.cs441.vmarket.parties;

/**
 * @author Reza Basseda, Peter Yasutake
 *
 */

public class Person {

	protected String fName;
	protected String lName;
	
	/**
	 * 
	 */
	public Person(){
		
	}
	
	/**
	 * 
	 * @param fn
	 * @param ln
	 */
	public Person(String fn, String ln){
		this.fName = fn;
		this.lName = ln;
	}
	
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
}
