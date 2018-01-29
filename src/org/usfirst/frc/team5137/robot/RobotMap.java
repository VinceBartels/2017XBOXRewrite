package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {

    public static Victor leftDriveMotor;
    public static Victor rightDriveMotor;
    
    public static Spark climberMotor;
    public static Spark slideDriveMotor;
    public static Spark shooterMotor;
    public static Spark feederMotor;
    public static Spark intakeMotor;
    
    //public static AnalogInput soundMaker1;
    //public static AnalogInput soundMaker2;
    //public static AnalogInput soundMaker3;
    //public static AnalogInput soundMaker4;
    public static Ultrasonic soundMaker1;
    public static Ultrasonic soundMaker2;
    public static Ultrasonic soundMaker3;
    public static Ultrasonic soundMaker4;
    
    public static DifferentialDrive hotWheels;
    
    public static ADXRS450_Gyro gyro;
    
    public static void init() {
	    	leftDriveMotor = new Victor(0);
	    	leftDriveMotor.setInverted(true);
	    	rightDriveMotor = new Victor(1);
	    	rightDriveMotor.setInverted(true);
	    	
	    	slideDriveMotor = new Spark (2);
	    	shooterMotor = new Spark(3);
	    	climberMotor = new Spark (4);
	    	feederMotor = new Spark(5);
	    	intakeMotor = new Spark(6);
	    	
	    	hotWheels = new DifferentialDrive(leftDriveMotor, rightDriveMotor);
	    	
	    	soundMaker1 =  new Ultrasonic(1,1);// CHECK THIS
	    	soundMaker2 =  new Ultrasonic(2,2);
	    	soundMaker3 =  new Ultrasonic(3,3);
	    	soundMaker4 =  new Ultrasonic(4,4);
	    	//soundMaker1 = new AnalogInput(0); 
	    	//soundMaker2 = new AnalogInput(1); 
	    	//soundMaker3 = new AnalogInput(2); 
	    	//soundMaker4 = new AnalogInput(3); 
	    	
	    	gyro = new ADXRS450_Gyro();
	    	//find what port the gyro is in
	    	
    }
}
