/**
 * 
 */
package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 * The CommandStation is the physical controller for the drone
 * that the pilot uses to send commands to the flightController.
 */

public class CommandStation implements SelfCheckCapable {
	
	private String processor;
	private String ram;
	private String memory;
	private String displayType;
	private String screenSize;
	
	public CommandStation() {
		
	}
	
	public void receiveData() {
		System.out.println("Data Recieved");
		return;
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
		return;
	}
	
	public void setWaypoints() {
		System.out.println("Waypoints Set");
		return;
	}
	
	public void onSticksDownandIn() {
		System.out.println("Motors Engaged");
		return;
	}
	
	public void onStickAction() {
		System.out.println("Executing Movement");
		return;
	}
	
	public void autoTakeoffTapped() {
		System.out.println("Auto Launching");
		return;
	}
	
	public void onFlightModeToggle() {
		System.out.println("Flight Mode Toggled");
		return;
	}
	
	public boolean onRightStickUp() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onRightStickDown() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickRight() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickLeft() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onRightStickRight() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onRightStickLeft() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickUp() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onLeftStickDown() {
		System.out.println("Stick Movement Detected");
		return true;
	}
	
	public boolean onBothSticksCentered() {
		System.out.println("No Stick Movement Detected");
		return true;
	}

	public boolean onCommenceRouteTapped() {
		System.out.println("Commencing Route");
		return true;
	}
	
	public void powerOn() {
		System.out.println("On");
		return;
		
	}
	
	public void autoLogin() {
		System.out.println("Logging in");
		return;
		
	}
	
	public void sendCredentials() {
		System.out.println("Sending Credentials");
		return;
		
	}
	
	public void checkUpdate() {
		System.out.println("Checking for Update");
		return;
		
	}
	
	public void initiateUpdate() {
		System.out.println("Updating");
		return;
		
	}
	
	public void requestUpdate() {
		System.out.println("Requesting Update");
		return;
		
	}
	
	public boolean verifyCompatability() {
		System.out.println("Verifying Compatability");
		return true;
		
	}
	
	public String displayInstallProgress() {
		System.out.println("DisplayingInstallProgress");
		return "50%";
		
	}
	
	public String displayInstallComplete() {
		System.out.println("Install Complete");
		return "50%";
		
	}
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Smart Controller";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
}
