 /**
 * 
 */
package edu.bridgeport.cs441.vmarket.parties;

import edu.bridgeport.cs441.vmarket.Commodity;

/**
 * @author Reza Basseda , Alaa Elsaka, Jay Sheth, Peter Yasutake
 *
 */
// buyer will add commodity with price

public interface Buyer{
	
	public boolean addCommodityToCart(Commodity commodityToSell, int quantity ,int sellingPrice);
	public boolean removeCommodityFromCart(Commodity commodityToSell, int quantity );
	public boolean commitPurchase();
	
}
