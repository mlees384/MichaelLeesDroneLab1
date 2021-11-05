/**
 * 
 */
package com.smartdronelab.dronemodel;

/**
 * @author mlees
 *
 */
public class Camera {
	
	private String make;
	private String model;
	private String weight;
	private double size;
	private String Resolution;
	private int fps;
	
	public void takePicture() {
		System.out.println("Took Picture");
	}
	
	public void startvideo() {
		System.out.println("Video Started");
	}
	
	public void stopvideo() {
		System.out.println("Video Stopped");
	}
	
	public void autoFocus() {
		System.out.println("Focused");
	}

}
