/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class CollisionAvoidanceSensor extends Sensor {
	
	private String maxDetectionRange;
	private String sensorType;
	
	/**
	 * If the detectObject method detects an object it will then measure the
	 * distance to said object and send that data for the flight controller for action.
	 */
	
	public boolean onDetectObject() {
		System.out.println("Object Detected");
		return true;
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

	@Override
	public String receiveData() {
		// TODO Auto-generated method stub
		return super.receiveData();
	}

}
