/**
 * 
 */
package edu.bridgeport.cs441.vmarket;

/**
 * 
 * This is the main class initializing the market and 
 * starting parties.
 * 
 * @author Reza Basseda
 * @since  1.0
 *
 *
 */
public class MainExecutor {
	
	private static MainExecutor instance;
	
	
	
	
	/**
	 * This constructor simply initialize the market and 
	 * read the configuration files.
	 */
	public MainExecutor() {
		super();
	}
	
	
	



	/**
	 * Since we need only one instance of MainExecutor across 
	 * the whole project, we follow singleton design pattern.
	 * This method makes the single existing instance available 
	 * to every object.
	 * 
	 * @return the instance
	 */
	public static MainExecutor getInstance() {
		if(instance == null) 
			instance = new MainExecutor();
		return instance;
	}






	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO First changes by Allaa
		System.out.println("First message shown to the market.");
		

	}
	
	

}
