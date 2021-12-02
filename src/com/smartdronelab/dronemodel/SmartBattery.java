/**
 * 
 */
package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 * 
 * The SmartBattery exists solely to provide power to the drone, and to measure
 * the remaining power and send that data to the FlightController for action.
 *
 */
public class SmartBattery implements SelfCheckCapable {
	
	private String weight;
	private int voltage;
	private int mah;
	private FlightController FlightController;
	
	public SmartBattery () {
		
	}
	
	public int measurePower() {
		System.out.println("84% remaining");
		return 84;
	}
	
	public void sendData() {
		System.out.println("Data Sent");
		return;
	}
	
	public void doublePress() {
		System.out.println("Powered On");
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
		return "My Battery";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
