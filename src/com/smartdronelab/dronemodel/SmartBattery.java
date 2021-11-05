/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
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
