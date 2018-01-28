package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	Victor leftDriveMotor = RobotMap.leftDriveMotor;
	Victor rightDriveMotor = RobotMap.rightDriveMotor;
	Spark slideDriveMotor = RobotMap.slideDriveMotor;
	ADXRS450_Gyro gyro = RobotMap.gyro;
	
	
	protected void initDefaultCommand() {
	setDefaultCommand(new ArcadeDrive());		
	}
	
	public void arcadeDrive(Joystick jackBlack) {
		leftDriveMotor.set(jackBlack.getRawAxis(1) + 0.5 * jackBlack.getRawAxis(4));
		rightDriveMotor.set(jackBlack.getRawAxis(1) - 0.5 * jackBlack.getRawAxis(4));
		slideDriveMotor.set(jackBlack.getRawAxis(0));
	}
	
	public void tankDrive(Joystick jackBlack) {
		leftDriveMotor.set(jackBlack.getRawAxis(1));
		rightDriveMotor.set(jackBlack.getRawAxis(5));
	}
	
	public void autoDriveStraight() {
		double angle = gyro.getAngle();
		if (angle == 0) {
			stop();
		}
		else if (angle > 0) {
			turnLeft();
		}
		else if (angle < 0) {
			turnRight();
		}
	}
	
	public void turnLeft() {
		leftDriveMotor.set(-0.25);
		rightDriveMotor.set(0.25);
		
	}
	public void turnRight() {
		leftDriveMotor.set(0.25);
		rightDriveMotor.set(-0.25);
		
	}
	public void stop() {
		leftDriveMotor.set(0);
		rightDriveMotor.set(0);
		slideDriveMotor.set(0);
	}
	
}
