package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DriveStraight extends Command{
	
	boolean isFinished;
	

	public DriveStraight() {
		requires(Robot.driveTrain);
		
	}
	
	protected void execute() {
		Robot.driveTrain.driveStraight();
		Timer.delay(3);
		
		
		isFinished = true;
		
	}
	protected void interrupted() {
		Robot.driveTrain.stop();
	}
	protected void stop() {
		Robot.driveTrain.stop();
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isFinished;
	}

}
