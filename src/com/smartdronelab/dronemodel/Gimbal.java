/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 * The Gimbal is connected to the body of the drone, and the camera is connected to the gimbal.
 * It function is to maintain the camera's baseline angle to facilitate smooth video capture.
 * It uses mechanical means and some input from sensors to accomplish this task.
 */
public class Gimbal {
	
	private String xRotationMax;
	private String yRotationMax;
	private String rotationRate;
	private String defaultAngle;
	
	public void yawRight() {
		System.out.println("Yawed Right x Degrees");
		return;
	}
	
	public void yawLeft() {
		System.out.println("yawed Left x Degrees");
		return;
	}
	
	public void pitchUp() {
		System.out.println("Pitched Up x Degrees");
		return;
	}
	
	public void pitchDown() {
		System.out.println("Pitched Down x Degrees");
		return;
	}
	
	public void rollRight() {
		System.out.println("Rolled Right x Degrees");
		return;
	}
	
	public void rollLeft() {
		System.out.println("Rolled Left x Degrees");
		return;
	}
	
	/**
	 * The setBaselineAngle method will run upon camera initialization or manually when prompted
	 * by the user.
	 */
	
	public void setBaselineAngle() {
		System.out.println("Baseline Angle Set");
		return;
	}
	
	/**
	 * the correctToBaselineAngle will happen almost perpetually as the drone moves
	 * on it's different axes.
	 */
	
	public void correctToBaselineAngle() {
		System.out.println("Angle adjusted x degrees");
		return;
	}

}
