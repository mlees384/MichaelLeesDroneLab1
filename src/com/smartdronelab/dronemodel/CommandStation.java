/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class CommandStation {
	
	private String processor;
	private String ram;
	private String memory;
	private String displayType;
	private String screenSize;
	
	public void receiveData() {
		System.out.println("Data Recieved");
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
	}
	
	public void setWaypoints() {
		System.out.println("Waypoints Set");
	}

}
