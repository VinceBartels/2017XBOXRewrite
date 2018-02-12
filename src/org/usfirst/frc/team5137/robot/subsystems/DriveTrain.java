package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {
	
	Victor leftDriveMotor = RobotMap.leftDriveMotor;
	Victor rightDriveMotor = RobotMap.rightDriveMotor;
	Spark slideDriveMotor = RobotMap.slideDriveMotor;
	
	ADXRS450_Gyro gyro = RobotMap.gyro;
	DifferentialDrive hotWheels = RobotMap.hotWheels;
	double Kp = 0.03;
	
	
	protected void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());		
	}
	
	public double adjustJoystickValue(double joystick, double deadZone) {
		double adjustedJoystick;
		if (Math.abs(joystick) < deadZone) {
			adjustedJoystick = 0;
		} else {
			adjustedJoystick = ((1 / (1 - deadZone)) * (joystick - deadZone));
		}
		return adjustedJoystick;
	}
	
	public void arcadeDrive(Joystick jackBlack) {
		double adjustedSlideJoystick = adjustJoystickValue(jackBlack.getRawAxis(0), .2);
		double adjustedArcadeJoystick = adjustJoystickValue(jackBlack.getRawAxis(1), .2);
		double adjustedTurnJoystick = adjustJoystickValue(jackBlack.getRawAxis(4), .2);
		
		
		slideDriveMotor.set(adjustedSlideJoystick);
		hotWheels.arcadeDrive(adjustedArcadeJoystick, adjustedTurnJoystick);
	}
	
	public void tankDrive(Joystick jackBlack) {
		double adjustedLeftJoystick = adjustJoystickValue(jackBlack.getRawAxis(1), .2);
		double adjustedRightJoystick = adjustJoystickValue(jackBlack.getRawAxis(5), .2);
		double adjustedSlideJoystick = adjustJoystickValue(jackBlack.getRawAxis(0), .2);
		
		hotWheels.tankDrive(adjustedLeftJoystick, adjustedRightJoystick);
		slideDriveMotor.set(adjustedSlideJoystick);
			
	}
	
	public void driveStraight() {
		double angle = gyro.getAngle();
		double speed = -0.65;
		hotWheels.arcadeDrive(speed, angle*Kp);
		
	}
	public void turnRight() {
		rightDriveMotor.set(.20);
		leftDriveMotor.set(-.20);
	}
	public void turnLeft() {
		rightDriveMotor.set(-.20);
		leftDriveMotor.set(.20);	
	}
	public void angle0() {
		rightDriveMotor.set(0);
		leftDriveMotor.set(0);
	}
	
	public void lateralDrive() {
		double angle = gyro.getAngle();
		double speed = .25;
		
		slideDriveMotor.set(speed);
		
		if(angle > 0) {
			turnRight();
		}
		else if (angle < 0) {
			turnLeft();
			
		}
			else if(angle == 0) {
			angle0();
				
		}		
	}
	
	public void stop() {;
	
		slideDriveMotor.set(0);
		hotWheels.arcadeDrive(0,0);
	}
	
}
