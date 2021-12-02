/**
 * 
 */
package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 * 
 * The sensor class is an abstract class to generalize other sensor classes.
 *
 */
public abstract class Sensor implements SelfCheckCapable {
	
	private String type;
	
	public String receiveData() {
		System.out.println("Data Received");
		return "xx.xxx.xxx";
	}
	
	public void measureData() {
		System.out.println("Data Measured");
		return;
	}
	
	public void sendData() {
		System.out.println("Data Sent");
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
		return "My Sensors";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
