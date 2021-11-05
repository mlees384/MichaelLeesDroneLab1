/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public abstract class Sensor {
	
	private String type;
	
	public void measureData() {
		System.out.println("Data Measured");
		return;
	}
	
	public void sendData() {
		System.out.println("Data Sent");
		return; 
	}

}
