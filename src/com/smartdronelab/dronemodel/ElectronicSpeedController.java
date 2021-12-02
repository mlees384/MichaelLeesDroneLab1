/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 * The ElectronicSpeedController is what sends commands to the motors after receiving
 * data and/or commands from the commandStation and/or flightController.
 */
public class ElectronicSpeedController extends Sensor {
	
	public ElectronicSpeedController() {
		
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
