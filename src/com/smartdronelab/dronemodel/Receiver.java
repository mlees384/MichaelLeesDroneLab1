/**
 * 
 */
package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 * 
 * The receiver received its commands from the CommandStation and passes them
 * on to the FlightController for action.
 *
 */
public class Receiver implements SelfCheckCapable {
	
	public Receiver() {
		
	}
	
	private String communicationType;
	private String numberOfChannels;
	private String frequency;
	
	public void receiveCommand() {
		System.out.println("Commmand Recieved");
		return;
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
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
		return "My Receiver";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
