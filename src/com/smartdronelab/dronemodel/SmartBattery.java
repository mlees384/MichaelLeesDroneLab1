/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 * 
 * The SmartBattery exists solely to provide power to the drone, and to measure
 * the remaining power and send that data to the FlightController for action.
 *
 */
public class SmartBattery {
	
	private String weight;
	private int voltage;
	private int mah;
	
	public int measurePower() {
		System.out.println("84% remaining");
		return 84;
	}
	
	public void sendData() {
		System.out.println("Data Sent");
		return;
	}

}
