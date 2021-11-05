/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class FlightController {
	
	private int maxInputs;
	private int maxOutputs;
	
	public void recieveData() {
		System.out.println("Data Recieved");
		
	}

	public void recieveCommamd() {
		System.out.println("Command Received");
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
	}
	
	public void moveForward() {
		System.out.println("Moved Forward x Feet");
	}
	
	public void moveBackward() {
		System.out.println("Moved Backward x Feet");
	}
	
	public void yawRight() {
		System.out.println("Yawed Right x Degrees");
	}
	
	public void yawLeft() {
		System.out.println("Yawed Left x Degrees");
	}
	
	public void slideRight() {
		System.out.println("Slid Right x Feet");
	}
	
	public void slideLeft() {
		System.out.println("Slid Left x Feet");
	}
	
	public void increaseAltitude() {
		System.out.println("Altitude Increased x Feet");
	}
	
	public void decreaseAltitude() {
		System.out.println("Altitude Decreased x Feet");
	}
	
	public void startFollowWaypoints() {
		System.out.println("Following Waypoints");
	}
	
	public void stopFollowWaypoints() {
		System.out.println("Resuming Manual Control");
	}
	
}