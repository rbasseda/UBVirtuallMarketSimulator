/**
 * Manager.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Created on: Nov 22, 2016
 * 
 * This class is assigned to Alla
 */
package edu.bridgeport.cs441.vmarket.parties;

import java.util.List;

import edu.bridgeport.cs441.vmarket.Commodity;

/**
 * @author Reza Basseda , Alaa Elsaka , Peter Yasutake
 *
 */
public class Manager extends Person implements Buyer, Seller {

/**
* @see edu.bridgeport.cs441.vmarket.parties.Seller#addCommodityToMarket(edu.bridgeport.cs441.vmarket.Commodity, int, int)
* 
*/
	private List <Party> partiesManaged; //Manager holds a reference to certain parties, which allows it to manage them.
	private List<Commodity> shoppingCart;
	
	public Manager(List <Party> partiesManaged) {
	super();
	this.partiesManaged = partiesManaged;
	}
	
	/**
	 * 
	 * @param p Party to add to this Manager's control.
	 */
	public void addManagement(Party p){
		partiesManaged.add(p);
	}
	
	/**
	 * 
	 * @param p Party to remove from this Manager's control.
	 */
	public void removeManagement(Party p){
		partiesManaged.remove(p);
	}
	
	/**
	 * 
	 * @return a list of every Party managed by this Manager.
	 */
	public Party[] getPartiesManaged(){
		Party[] listParties = new Party[partiesManaged.size()];
		
		for (int i = 0; i < listParties.length; i++){
			listParties[i] = partiesManaged.get(i);
		}
		
		return listParties;
	}
	

	/**
	 * Example manager method.
	 * @param buyer
	 * @param commodityToSell
	 * @param quantity
	 * @param sellingPrice
	 * @return
	 */
	public boolean addCommodityToBuyerCart(Buyer buyer, Commodity commodityToSell, int quantity, int sellingPrice){
		boolean buyerManaged = false;
		//Check to see if argument buyer is managed by this Manager.
		for (Party party: partiesManaged){
			if (party instanceof Buyer){
				if (party.equals(buyer)){
					buyerManaged = true;
					break;
				}
			}
		}
		
		if (!buyerManaged){
			System.err.println("This Buyer is not managed by this Manager!");
			return false;
		}
		
		return buyer.addCommodityToCart(commodityToSell, quantity, sellingPrice);
	}
	
	
	
	

	/**
	 * The manager can add Commodity to the market as well as removing it
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
	public boolean removeCommodityFromMarket(Commodity commodityToSell, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	/**
	 * The manager can add Commodity to the market as well as removing it
	 */
	
	/** Doubt:
	* How can Manager add stuff to buyer's cart?
	* How can he remove it from buyer's cart?
	* -Jay Sheth
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

	@Override
	public Commodity[] viewCommoditiesInMarket() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	