/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class GPS extends Sensor {
	
	private int numberofSatellites;

	@Override
	public void measureData() {
		// TODO Auto-generated method stub
		super.measureData();
		System.out.println("Data Measured");
		return;
	}

	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		super.sendData();
		System.out.println("Data Sent");
		return;
	}

}
