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
	private Antenna Antenna;
	private Camera Hasselblad;
	private CollisionAvoidanceSensor CASensorTop;
	private CollisionAvoidanceSensor CASensorBottom;
	private CollisionAvoidanceSensor CASensorLeft;
	private CollisionAvoidanceSensor CASensorRight;
	private CollisionAvoidanceSensor CASensorFront;
	private CollisionAvoidanceSensor CASensorBack;
	private CommandStation SmartController;
	private ElectronicSpeedController ESC;
	private FlightController FlightController;
	private Gimbal Gimbal;
	private Gps Gps;
	private InternalMeasurementUnit Imu;
	private Light FrontLeftLight;
	private Light FrontRightLight;
	private Light BackLeftLight;
	private Light BackRightLight;
	private Light BottomLight;
	private Propeller Prop1;
	private Propeller Prop2;
	private Propeller Prop3;
	private Propeller Prop4;
	private Receiver Receiver;
	private Sensor Sensor;
	private SmartBattery Battery;
	
	
	public UnmannedAerialSystem() {
		Antenna = new Antenna();
		Hasselblad = new Camera();
		CASensorTop = new CollisionAvoidanceSensor();
		CASensorBottom = new CollisionAvoidanceSensor();
		CASensorLeft = new CollisionAvoidanceSensor();
		CASensorRight = new CollisionAvoidanceSensor();
		CASensorFront = new CollisionAvoidanceSensor();
		CASensorBack = new CollisionAvoidanceSensor();
		SmartController = new CommandStation();
		ESC = new ElectronicSpeedController();
		FlightController = new FlightController();
		Gimbal = new Gimbal();
		Gps = new Gps();
		Imu = new InternalMeasurementUnit();
		FrontLeftLight = new Light();
		FrontRightLight = new Light();
		BackLeftLight = new Light();
		BackRightLight = new Light();
		BottomLight = new Light();
		Prop1 = new Propeller();
		Prop2 = new Propeller();
		Prop3 = new Propeller();
		Prop4 = new Propeller();
		Receiver = new Receiver();
		Battery = new SmartBattery();
		
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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnmannedAerialSystem mavic2Pro = new UnmannedAerialSystem();
		mavic2Pro.runSelfCheck();
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