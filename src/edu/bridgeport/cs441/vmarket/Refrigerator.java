/**
 * Refrigerator.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Created on: Dec 13, 2016
 */
package edu.bridgeport.cs441.vmarket;

/**
 * @author Reza Basseda
 *
 */
public class Refrigerator extends Commodity {
	
	private int numberOfAdjustableShelves;
	private int numberOfFixedShelves;
	private boolean iceMaker;

	public Refrigerator(int height, int width, int depth, String modelName, String manufacturer, double weight,
			boolean childLock) {
		super(height, width, depth, modelName, manufacturer, weight, childLock);
		// TODO Auto-generated constructor stub
	}
	
	

}
