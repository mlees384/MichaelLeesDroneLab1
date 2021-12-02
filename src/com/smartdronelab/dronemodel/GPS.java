/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class GPS extends Sensor {
	
	/**
	 * The GPS unit needs to be connected to a minimum of four satellites
	 * to function correctly.
	 */
	
	private int numberofSatellites;
	
	public GPS() {
		
	}

	@Override
	public String receiveData() {
		// TODO Auto-generated method stub
		return super.receiveData();
	}

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
