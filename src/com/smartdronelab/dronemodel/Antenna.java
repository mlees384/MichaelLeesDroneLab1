/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class Antenna {
	
	private String frequency;
	
	/**
	 * The Antenna will send imaging data from the camera back to the Command Station for viewing.
	 */
	
	public void sendData() {
		System.out.println("Data Sent");
		return;
	}

}
