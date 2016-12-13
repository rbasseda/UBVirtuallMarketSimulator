/**
 * Commodity.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Phaneendra and ashok
 * 
 * Created on: Nov 22, 2016
 */
package edu.bridgeport.cs441.vmarket;

import edu.bridgeport.cs441.vmarket.parties.Person;

/**
 * The Commodity class is representing any item that can be traded in 
 * the market.
 *  
 * The class has the following attributes:
 * This is a demo of EGit
 * 
 * 
 * @author Reza Basseda
 *
 */
public class Commodity implements Purchasable {
	protected int height;
	protected int width;
	protected int depth;
	protected String modelName;
	protected String manufacturer;
	protected double weight;
	protected boolean childLock;

	/**
	 * @author Reza Basseda
	 */
	/* (non-Javadoc)
	 * @see edu.bridgeport.cs441.vmarket.Purchasable#Purchased(int, edu.bridgeport.cs441.vmarket.parties.Person)
	 */
	public boolean Purchased(int price, Person reciever) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the childLock
	 */
	public boolean isChildLock() {
		return childLock;
	}

	/**
	 * @param childLock the childLock to set
	 */
	public void setChildLock(boolean childLock) {
		this.childLock = childLock;
	}

	/**
	 * @param height
	 * @param width
	 * @param depth
	 * @param modelName
	 * @param manufacturer
	 * @param weight
	 * @param childLock
	 */
	public Commodity(int height, int width, int depth, String modelName, String manufacturer, double weight,
			boolean childLock) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.childLock = childLock;
	}
	
	
}
