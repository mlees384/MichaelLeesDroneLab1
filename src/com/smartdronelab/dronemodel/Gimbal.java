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
	
	public void setBaselineAngle() {
		System.out.println("Baseline Angle Set");
		return;
	}
	
	public void correctToBaselineAngle() {
		System.out.println("Angle adjusted x degrees");
		return;
	}

}
