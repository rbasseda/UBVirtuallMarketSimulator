/**
 /**
 * Trader.java
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

/**
 * As The trader could also be a seller for other products , so I suggest implement the selling interface as may be proposed by Professor Reza
 * @author AElsaka
 *
 */
public class Trader extends Party implements Buyer, Seller {

	/* (non-Javadoc)
	 * @see edu.bridgeport.cs441.vmarket.parties.Seller#addCommodityToMarket(edu.bridgeport.cs441.vmarket.Commodity, int, int)
	 */
	@Override
	public boolean addCommodityToMarket(Commodity commodityToSell, int initialPrice, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.bridgeport.cs441.vmarket.parties.Seller#removeCommodityToMarket(edu.bridgeport.cs441.vmarket.Commodity, int)
	 */
	@Override
	public boolean removeCommodityToMarket(Commodity commodityToSell, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * The manager can add Commodity to the market as well as removing it
	 */
	

	/* (non-Javadoc)
	 * @see edu.bridgeport.cs441.vmarket.parties.Seller#removeCommodityToMarket(edu.bridgeport.cs441.vmarket.Commodity, int)
	 */
	@Override
	public boolean removeCommodityFromCart(Commodity commodityToSell, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	// change as per inerface - Jay Sheth
	@Override
	public boolean addCommodityToCart(Commodity commodityToSell, int quantity, int sellingPrice) {
		// TODO Auto-generated method stub
		return false;
	}
	
}




	
	
	


