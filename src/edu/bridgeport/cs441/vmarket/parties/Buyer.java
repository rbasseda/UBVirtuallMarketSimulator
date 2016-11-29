/**
 * 
 */
package edu.bridgeport.cs441.vmarket.parties;

import edu.bridgeport.cs441.vmarket.Commodity;

/**
 * @author Reza Basseda , Alaa Elsaka
 *
 */
public interface Buyer{
	
	public boolean addCommodityToCart(Commodity commodityToSell, int quantity );
	public boolean removeCommodityFromCart(Commodity commodityToSell, int quantity );
	
}
