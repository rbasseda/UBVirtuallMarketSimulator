/**
 * Shopper.java
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

import java.util.List;

import edu.bridgeport.cs441.vmarket.Commodity;

/**
 * @author Reza Basseda , Alaa Elsaka , Jay Sheth , Peter Yasutake
 *
 */
public class Shopper extends Party implements Buyer {
	private float budget;
	private List<Commodity> shoppingCart;
	
	
	/**
	 * @param fName
	 * @param lName
	 * @param id
	 * @param corporationName
	 * @param budget
	 */
	public Shopper(String fName, String lName, int id, String corporationName, float budget) {
		super(fName, lName, id, corporationName);
		this.budget = budget;
	}

	

	/**
	 * @return the budget
	 */
	public float getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(float budget) {
		this.budget = budget;
	}

	/**
	 * The manager can add Commodity to the market as well as removing it
	 */
	

	/* (non-Javadoc)
	 * @see edu.bridgeport.cs441.vmarket.parties.Seller#removeCommodityToMarket(edu.bridgeport.cs441.vmarket.Commodity, int)
	 */
	@Override
	public boolean addCommodityToCart(Commodity commodityToSell, int quantity, int sellingPrice) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean removeCommodityFromCart(Commodity commodityToSell, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean commitPurchase() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}

