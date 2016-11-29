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

import edu.bridgeport.cs441.vmarket.Commodity;

/**
 * @author Reza Basseda , Alaa Elsaka
 *
 */
public class Shopper extends Party implements Buyer {

	/**
	 * The manager can add Commodity to the market as well as removing it
	 */
	@Override
	public boolean addCommodityToCart(Commodity commodityToSell, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.bridgeport.cs441.vmarket.parties.Seller#removeCommodityToMarket(edu.bridgeport.cs441.vmarket.Commodity, int)
	 */
	@Override
	public boolean removeCommodityFromCart(Commodity commodityToSell, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
