/**
 * 
 */
package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 * 
 * The motor receives its commands from the ElectronicSpeedController.
 *
 */
public class Motor implements SelfCheckCapable {
	
	private int rpm;
	private String spinDirection;
	
	public Motor () {
		
	}
	
	public void recieveCommand() {
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
	
	public void increaseRpm() {
		System.out.println("RPM increased");
		return;
	}
	
	public void decreaseRpm() {
		System.out.println("RPM decreased");
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
		return "My Motors";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
