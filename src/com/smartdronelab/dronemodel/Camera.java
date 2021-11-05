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
	private int fps;q
	
	public void takePicture() {
		System.out.println("Took Picture");
		return;
	}
	
	public void startvideo() {
		System.out.println("Video Started");
		return;
	}
	
	public void stopvideo() {
		System.out.println("Video Stopped");
		return;
	}
	
	public void autoFocus() {
		System.out.println("Focused");
		return;
	}

}
