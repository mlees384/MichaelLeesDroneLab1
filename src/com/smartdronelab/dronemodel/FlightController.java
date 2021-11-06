/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 * The flightController can be thought of the brain of the entire system. It takes commands
 * from the commandStation and data from the sensors and takes action accordingly.
 */
public class FlightController {
	
	private int maxInputs;
	private int maxOutputs;
	
	public void recieveData() {
		System.out.println("Data Recieved");
		return;
	}

	public void recieveCommamd() {
		System.out.println("Command Received");
		return;
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
		return;
	}
	
	public void moveForward() {
		System.out.println("Moved Forward x Feet");
		return;
	}
	
	public void moveBackward() {
		System.out.println("Moved Backward x Feet");
		return;
	}
	
	public void yawRight() {
		System.out.println("Yawed Right x Degrees");
		return;
	}
	
	public void yawLeft() {
		System.out.println("Yawed Left x Degrees");
		return;
	}
	
	public void slideRight() {
		System.out.println("Slid Right x Feet");
		return;
	}
	
	public void slideLeft() {
		System.out.println("Slid Left x Feet");
		return;
	}
	
	public void increaseAltitude() {
		System.out.println("Altitude Increased x Feet");
		return;
	}
	
	public void decreaseAltitude() {
		System.out.println("Altitude Decreased x Feet");
		return;
	}
	
	public void startFollowWaypoints() {
		System.out.println("Following Waypoints");
		return;
	}
	
	public void stopFollowWaypoints() {
		System.out.println("Resuming Manual Control");
		return;
	}
	
	/**
	 * 20% of remaining battery is the "bingo" mark for the drone
	 * to initiate it's returnHome command.
	 */
	
	public boolean batteryLessOrEqual20(){
		System.out.println("Battery At 20%");
		return true;
	}
	
	public void returnHome() {
		System.out.println("Returning Home");
		return;
	}
	
}