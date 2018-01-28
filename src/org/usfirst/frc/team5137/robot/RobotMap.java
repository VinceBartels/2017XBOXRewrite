package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {

    public static Victor leftDriveMotor;
    public static Victor rightDriveMotor;
    
    public static Spark climberMotor;
    public static Spark slideDriveMotor;
    public static Spark shooterMotor;
    public static Spark feederMotor;
    public static Spark intakeMotor;
    
    public static ADXRS450_Gyro gyro;
    
    public static void init() {
	    	leftDriveMotor = new Victor(0);
	    	rightDriveMotor = new Victor(1);
	    	rightDriveMotor.setInverted(true);
	    	
	    	slideDriveMotor = new Spark (2);
	    	shooterMotor = new Spark(3);
	    	climberMotor = new Spark (4);
	    	feederMotor = new Spark(5);
	    	intakeMotor = new Spark(6);
	    	
	    	gyro = new ADXRS450_Gyro();
	    	//find what port the gyro is in
	    	
    }
}
