/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class Receiver {
	
	private String communicationType;
	private String numberOfChannels;
	private String frequency;
	
	public void receiveCommand() {
		System.out.println("Commmand Recieved");
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
	}

}
