/**
 * 
 */
package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 * The server communicates with the Command Station to verify credentials and check firmware updates.
 * 
 */
public class Server implements SelfCheckCapable {
	
	private String make;
	private String model;
	private String location;
	private String networkSpeed;
	
	public Server() {
		
	}
	
	public boolean validateCredentials() {
		System.out.println("Credentials Validated");
		return true;
	}
	
	public double compareFirmware() {
		System.out.println("Firmware Version 3.17");
		return 3.17;
	}
	
	public boolean updateAvailable() {
		System.out.println("Update Available");
		return true;
	}
	
	public byte pushUpdate() {
		System.out.println("Pushing Update");
		return 0;
	}
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "DJI Server";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
