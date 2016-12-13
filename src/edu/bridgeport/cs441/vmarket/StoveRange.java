/**
 * StoveRange.java
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
public class StoveRange extends Commodity {
	
	private String rangePowerSource;
	private boolean conventionOven;
	
	/**
	 * @param height
	 * @param width
	 * @param depth
	 * @param modelName
	 * @param manufacturer
	 * @param weight
	 * @param childLock
	 * @param rangePowerSource
	 * @param conventionOven
	 */
	public StoveRange(int height, int width, int depth, String modelName, String manufacturer, double weight,
			boolean childLock, String rangePowerSource, boolean conventionOven) {
		super(height, width, depth, modelName, manufacturer, weight, childLock);
		this.rangePowerSource = rangePowerSource;
		this.conventionOven = conventionOven;
	}

	/**
	 * @return the rangePowerSource
	 */
	public String getRangePowerSource() {
		return rangePowerSource;
	}

	/**
	 * @param rangePowerSource the rangePowerSource to set
	 */
	public void setRangePowerSource(String rangePowerSource) {
		this.rangePowerSource = rangePowerSource;
	}

	/**
	 * @return the conventionOven
	 */
	public boolean isConventionOven() {
		return conventionOven;
	}

	/**
	 * @param conventionOven the conventionOven to set
	 */
	public void setConventionOven(boolean conventionOven) {
		this.conventionOven = conventionOven;
	}

	public StoveRange(int height, int width, int depth, String modelName, String manufacturer, double weight,
			boolean childLock) {
		super(height, width, depth, modelName, manufacturer, weight, childLock);
		// TODO Auto-generated constructor stub
	}

}
