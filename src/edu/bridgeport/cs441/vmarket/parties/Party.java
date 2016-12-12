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
 * @author Reza Basseda, Peter Yasutake
 *
 */
public abstract class Party extends Person {
	int id;
	String corporationName;
	
	/**
	 * @param fName 
	 * @param lName
	 * @param id
	 */
	public Party(String fName, String lName, int id, String corporationName) {
		super(fName,lName);
		this.id = id;
		this.corporationName = corporationName;
	}
	/**
	 * 
	 */
	public Party() {
		super();
		// TODO Auto-generated constructor stub
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
	/**
	 * @return the corporationName
	 */
	public String getCorporationName() {
		return corporationName;
	}

	/**
	 * @param corporationName the corporationName to set
	 */
	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}
	
	
	
}
