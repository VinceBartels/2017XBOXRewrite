package org.usfirst.frc.team5137.robot.commands;


import org.usfirst.frc.team5137.robot.RobotMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class ResetGyro extends Command {
	ADXRS450_Gyro gyro = RobotMap.gyro;
	
	boolean isFinished = false;
	
	
	public ResetGyro() {
		
	}
	
	protected void execute() {
		gyro.reset();
		Timer.delay(1);
		gyro.calibrate();
		Timer.delay(0.5);
		isFinished = true;
		
		
	}

	protected boolean isFinished() {
		
		return isFinished;
	
	
	}
	
}
