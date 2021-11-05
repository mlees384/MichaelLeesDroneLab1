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
	
	public boolean detectObject() {
		System.out.println("Object Detected");
		return true;
	}

	@Override
	public void measureData() {
		// TODO Auto-generated method stub
		super.measureData();
		System.out.println("Data Measured");
	}

	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		super.sendData();
		System.out.println("Data Sent");
	}

}
