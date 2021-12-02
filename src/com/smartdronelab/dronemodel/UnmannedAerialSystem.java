package com.smartdronelab.dronemodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 * Envision the UnamannedAerialSystem Class as an empty shell with which
 * to hold other classes and call to methods within them, just as the body of a drone
 * is just a shell to hold all of it's components and systems.
 */

public class UnmannedAerialSystem implements SelfCheckCapable {

	private String make;
	private String model;
	private String weight;
	private String size;
	private Antenna myAntenna;
	private Camera myHasselblad;
	private CollisionAvoidanceSensor CASensorTop;
	private CollisionAvoidanceSensor CASensorBottom;
	private CollisionAvoidanceSensor CASensorLeft;
	private CollisionAvoidanceSensor CASensorRight;
	private CollisionAvoidanceSensor CASensorFront;
	private CollisionAvoidanceSensor CASensorBack;
	private CommandStation mySmartController;
	private ElectronicSpeedController myESC;
	private FlightController myFlightController;
	private Gimbal myGimbal;
	private GPS myGPS;
	private InternalMeasurementUnit myIMU;
	private Light FrontLeftLight;
	private Light FrontRightLight;
	private Light BackLeftLight;
	private Light BackRightLight;
	private Light BottomLight;
	private Propeller Prop1;
	private Propeller Prop2;
	private Propeller Prop3;
	private Propeller Prop4;
	private Receiver myReceiver;
	private Sensor Sensor;
	private SmartBattery myBattery;
	private Server DJIServer;
	private Motor Motor1;
	private Motor Motor2;
	private Motor Motor3;
	private Motor Motor4;
	
	
	public UnmannedAerialSystem() {
		myAntenna = new Antenna();
		myHasselblad = new Camera();
		CASensorTop = new CollisionAvoidanceSensor();
		CASensorBottom = new CollisionAvoidanceSensor();
		CASensorLeft = new CollisionAvoidanceSensor();
		CASensorRight = new CollisionAvoidanceSensor();
		CASensorFront = new CollisionAvoidanceSensor();
		CASensorBack = new CollisionAvoidanceSensor();
		mySmartController = new CommandStation();
		myESC = new ElectronicSpeedController();
		myFlightController = new FlightController();
		myGimbal = new Gimbal();
		myGPS = new GPS();
		myIMU = new InternalMeasurementUnit();
		FrontLeftLight = new Light();
		FrontRightLight = new Light();
		BackLeftLight = new Light();
		BackRightLight = new Light();
		BottomLight = new Light();
		Prop1 = new Propeller();
		Prop2 = new Propeller();
		Prop3 = new Propeller();
		Prop4 = new Propeller();
		myReceiver = new Receiver();
		myBattery = new SmartBattery();
		DJIServer = new Server();
		Motor1 = new Motor();
		Motor2 = new Motor();
		Motor3 = new Motor();
		Motor4 = new Motor();
		
	}
	
	
	/**
	 * The UnmannedAerialSystem class will receive 
	 * data and commands from other classes and take action accordingly
	 */
	
	public void recieveData() {
		System.out.println("Data Recieved");
		return;
	}
	
	public void recieveCommand() {
		System.out.println("Command Received");
		return;
	}
	
	public void executeCommand() {
		System.out.println("Executing Command");
		return;
	}
	
	public void playWelcomeJingle() {
		System.out.println("Playing Welcome Jingle");
		return;
	}
	
	public boolean onAutoTakeoffComplete() {
		System.out.println("Auto Takeoff Complete");
		return true;
	}
	
	public boolean onRouteComplete() {
		System.out.println("Route Complete");
		return true;
	}
	
	public boolean onLandingComplete() {
		System.out.println("Landing Complete");
		return true;
	
	}
	
	public boolean onReturnComplete() {
		System.out.println("Return Complete");
		return true;
		
	}
		
	public byte analyzeSite() {
		System.out.println("Analyzing Site");
		return 0;
		
	}
	
	public void powerOn() {
		System.out.println("On");
		return;
		
	}
	
	public void installUpdate() {
		System.out.println("Installing Update");
		return;
		
	}
	
	public boolean completeUpdate() {
		System.out.println("Update Complete");
		return true;
		
	}
	
	public boolean onConnectionLost() {
		System.out.println("Connection Lost");
		return true;
		
	}
	
	public void adjustLandingSite() {
		System.out.println("Adjusting Landing Site");
		return;
		
	}
	
	public void autoLand() {
		System.out.println("Landing");
		return;
		
	}
	
	public void forceAutoLand() {
		System.out.println("Forcing Landing");
		return;
		
	}
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnmannedAerialSystem Mavic2Pro = new UnmannedAerialSystem();
		SmartBattery myBattery = new SmartBattery();
		Server DJIServer = new Server();
		Receiver myReceiver = new Receiver();
		Propeller Prop1 = new Propeller();
		Propeller Prop2 = new Propeller();
		Propeller Prop3 = new Propeller();
		Propeller Prop4 = new Propeller();
		Motor Motor1 = new Motor();
		Motor Motor2 = new Motor();
		Motor Motor3 = new Motor();
		Motor Motor4 = new Motor();
		Light FrontLeftLight = new Light();
		Light FrontRightLight = new Light();
		Light BackLeftLight = new Light();
		Light BackRightLight = new Light();
		Gimbal myGimbal = new Gimbal();
		FlightController myFlightController = new FlightController();
		CommandStation mySmartController = new CommandStation();
		Camera myHasselblad = new Camera();
		Antenna myAntenna = new Antenna();
		InternalMeasurementUnit myIMU = new InternalMeasurementUnit();
		GPS myGPS = new GPS();
		ElectronicSpeedController myESC = new ElectronicSpeedController();
		CollisionAvoidanceSensor CASensorTop = new CollisionAvoidanceSensor();
		CollisionAvoidanceSensor CASensorBottom = new CollisionAvoidanceSensor();
		CollisionAvoidanceSensor CASensorLeft = new CollisionAvoidanceSensor();
		CollisionAvoidanceSensor CASensorRight = new CollisionAvoidanceSensor();
		CollisionAvoidanceSensor CASensorFront = new CollisionAvoidanceSensor();
		CollisionAvoidanceSensor CASensorBack = new CollisionAvoidanceSensor();
		Mavic2Pro.runSelfCheck();
		myBattery.runSelfCheck();
		DJIServer.runSelfCheck();
		myReceiver.runSelfCheck();
		Prop1.runSelfCheck();
		Prop2.runSelfCheck();
		Prop3.runSelfCheck();
		Prop4.runSelfCheck();
		Motor1.runSelfCheck();
		Motor2.runSelfCheck();
		Motor3.runSelfCheck();
		Motor4.runSelfCheck();
		FrontLeftLight.runSelfCheck();
		FrontRightLight.runSelfCheck();
		BackLeftLight.runSelfCheck();
		BackRightLight.runSelfCheck();
		myGimbal.runSelfCheck();
		myFlightController.runSelfCheck();
		mySmartController.runSelfCheck();
		myHasselblad.runSelfCheck();
		myAntenna.runSelfCheck();
		myIMU.runSelfCheck();
		myGPS.runSelfCheck();
		myESC.runSelfCheck();
		CASensorTop.runSelfCheck();
		CASensorBottom.runSelfCheck();
		CASensorLeft.runSelfCheck();
		CASensorRight.runSelfCheck();
		CASensorFront.runSelfCheck();
		CASensorBack.runSelfCheck();
		
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Mavic 2 Pro";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
}