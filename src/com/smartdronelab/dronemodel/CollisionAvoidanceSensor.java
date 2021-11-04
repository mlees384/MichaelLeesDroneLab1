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
		return true;
		
	}

	@Override
	public void measureData() {
		// TODO Auto-generated method stub
		super.measureData();
	}

	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		super.sendData();
	}

}
