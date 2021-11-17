/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 * The CommandStation is the physical controller for the drone
 * that the pilot uses to send commands to the flightController.
 */

public class CommandStation {
	
	private String processor;
	private String ram;
	private String memory;
	private String displayType;
	private String screenSize;
	
	public void receiveData() {
		System.out.println("Data Recieved");
		return;
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
		return;
	}
	
	public void setWaypoints() {
		System.out.println("Waypoints Set");
		return;
	}
	
	public void onSticksDownandIn() {
		System.out.println("Motors Engaged");
		return;
	}
	
	public void onStickAction() {
		System.out.println("Executing Movement");
		return;
	}
	
	public void autoTakeoffTapped() {
		System.out.println("Auto Launching");
		return;
	}
	
	public void onFlightModeToggle() {
		System.out.println("Flight Mode Toggled");
		return;
	}
	
	public boolean onRightStickUp() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onRightStickDown() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickRight() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickLeft() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onRightStickRight() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onRightStickLeft() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickUp() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickDown() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onBothSticksCentered() {
		System.out.println("No Stick Movement Detected");
		return true;
	}

	public boolean onCommenceRouteTapped() {
		System.out.println("Commencing Route");
		return true;
	}
}
