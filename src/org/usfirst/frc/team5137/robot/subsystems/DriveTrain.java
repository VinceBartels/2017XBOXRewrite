package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	Victor leftDriveMotor = RobotMap.leftDriveMotor;
	Victor rightDriveMotor = RobotMap.rightDriveMotor;
	Spark slideDriveMotor = RobotMap.slideDriveMotor;
	
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

	public void stop() {
		leftDriveMotor.set(0);
		rightDriveMotor.set(0);
		slideDriveMotor.set(0);
	}
	
}
