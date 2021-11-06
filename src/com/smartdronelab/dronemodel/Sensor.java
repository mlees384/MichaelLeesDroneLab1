/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 * 
 * The sensor is an abstract class to generalize other sensor classes.
 *
 */
public abstract class Sensor {
	
	private String type;
	
	public String receiveData() {
		System.out.println("Data Received");
		return "xx.xxx.xxx";
	}
	
	public void measureData() {
		System.out.println("Data Measured");
		return;
	}
	
	public void sendData() {
		System.out.println("Data Sent");
		return; 
	}

}
