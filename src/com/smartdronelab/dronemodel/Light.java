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
public class Light implements SelfCheckCapable {
	
	private String color;
	private int lumens;
	private String pattern;
	
	public Light() {
		
	}
	
	public void receiveCommand() {
		System.out.println("Command Recieved");
		return;
	}
	
	public void turnOn() {
		System.out.println("On");
		return;
	}
	
	public void turnOff() {
		System.out.println("Off");
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
		return "My Lights";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
