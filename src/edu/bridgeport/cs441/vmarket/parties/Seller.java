/**
 * 
 */
package edu.bridgeport.cs441.vmarket.parties;

import edu.bridgeport.cs441.vmarket.Commodity;

/**
 * @author Reza Basseda, Peter Yasutake
 *
 */
public interface Seller{
	public boolean addCommodityToMarket(Commodity commodityToSell, int initialPrice, int quantity );
	public boolean removeCommodityFromMarket(Commodity commodityToSell, int quantity );
	public Commodity[] viewCommoditiesInMarket();
	
	
}
