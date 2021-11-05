/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class Motor {
	
	private int rpm;
	private String spinDirection;
	
	public void recieveCommand() {
		System.out.println("Command Recieved");
	}
	
	public void turnOn() {
		System.out.println("On");
	}
	
	public void turnOff() {
		System.out.println("Off");
	}
	
	public void increaseRpm() {
		System.out.println("RPM increased");
	}
	
	public void decreaseRpm() {
		System.out.println("RPM decreased");
	}

}
