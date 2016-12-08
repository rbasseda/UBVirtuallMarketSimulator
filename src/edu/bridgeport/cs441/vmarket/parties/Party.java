/**
 * Party.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Created on: Nov 22, 2016
 */
package edu.bridgeport.cs441.vmarket.parties;

/**
 * @author Reza Basseda
 *
 */
public abstract class Party extends Person {
	protected String fName;
	protected String lName;
	int id;
	/**
	 * @param fName 
	 * @param lName
	 * @param id
	 */
	public Party(String fName, String lName, int id) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.id = id;
	}
	/**
	 * 
	 */
	public Party() {
		super();
		// TODO Auto-generated constructor stub
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
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
