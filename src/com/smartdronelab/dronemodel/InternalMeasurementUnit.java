/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 * The InternalMeasurementUnit (IMU) measures internal forces on the
 * drone such as G-forces and sends that data to the flightController for action.
 */

public class InternalMeasurementUnit extends Sensor {

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

	@Override
	public String receiveData() {
		// TODO Auto-generated method stub
		return super.receiveData();
	}

}
