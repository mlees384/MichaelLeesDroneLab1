/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class Light {
	
	private String color;
	private int lumens;
	private String pattern;
	
	public void receiveCommand() {
		System.out.println("Command Recieved");
	}
	
	public void turnOn() {
		System.out.println("On");
	}
	
	public void turnOff() {
		System.out.println("Off");
	}

}
