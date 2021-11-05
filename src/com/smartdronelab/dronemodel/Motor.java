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
		return;
	}
	
	public void turnOn() {
		System.out.println("On");
		return;
	}
	
	public void turnOff() {
		System.out.println("Off");
		return;
	}
	
	public void increaseRpm() {
		System.out.println("RPM increased");
		return;
	}
	
	public void decreaseRpm() {
		System.out.println("RPM decreased");
		return;
	}

}
