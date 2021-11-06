/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 * Envision the UnamannedAerialSystem Class as an empty shell with which
 * to hold other classes and call to methods within them, just as the body of a drone
 * is just a shell to hold all of it's components and systems.
 */

public class UnmannedAerialSystem {

	private String make;
	private String model;
	private String weight;
	private String size;
	
	/**
	 * The UnmannedAerialSystem class will receive 
	 * data and commands from other classes and take action accordingly
	 */
	
	public void recieveData() {
		System.out.println("Data Recieved");
		return;
	}
	
	public void recieveCommand() {
		System.out.println("Command Received");
		return;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}