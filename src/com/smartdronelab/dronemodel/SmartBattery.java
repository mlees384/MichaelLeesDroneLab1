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
	
	public void measurePower() {
		System.out.println("x% remaining");
	}
	
	public void sendData() {
		System.out.println("Data Senmt");
	}

}
