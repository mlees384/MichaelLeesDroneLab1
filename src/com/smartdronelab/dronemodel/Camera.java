/**
 * 
 */
package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 */
public class Camera implements SelfCheckCapable {
	
	private String make;
	private String model;
	private String weight;
	private String size;
	private String Resolution;
	private int fps;
	
	public Camera() {
		
	}
	
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
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Hasselblad";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
