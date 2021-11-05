/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class Gimbal {
	
	private String xRotationMax;
	private String yRotationMax;
	private String rotationRate;
	private String defaultAngle;
	
	public void yawRight() {
		System.out.println("Yawed Right x Degrees");
	}
	
	public void yawLeft() {
		System.out.println("yawed Left x Degrees");
	}
	
	public void pitchUp() {
		System.out.println("Pitched Up x Degrees");
	}
	
	public void pitchDown() {
		System.out.println("Pitched Down x Degrees");
	}
	
	public void rollRight() {
		System.out.println("Rolled Right x Degrees");
	}
	
	public void rollLeft() {
		System.out.println("Rolled Left x Degrees");
	}
	
	public void setBaselineAngle() {
		System.out.println("Baseline Angle Set");
	}
	
	public void correctToBaselineAngle() {
		System.out.println("Angle adjusted x degrees");
	}

}
