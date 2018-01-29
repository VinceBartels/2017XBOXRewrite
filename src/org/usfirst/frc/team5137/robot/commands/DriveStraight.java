package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveStraight extends Command{
	
	public DriveStraight() {
		requires(Robot.driveTrain);	
	}
	public void execute() {
		
		if(Robot.timer.get() < 2) {
			Robot.driveTrain.driveStraight();
		}
		else if(Robot.timer.get() < 4) {
			Robot.driveTrain.lateralDrive();
			
		}
		else {
			Robot.driveTrain.stop();
			
		}	
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
		return false;
	}

}
