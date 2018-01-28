package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {
	
	public Climb() {
		requires(Robot.climber);
	}
	
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.climber.climb();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.climber.stop();
	}

	protected boolean isFinished() {
		return false;
	} 

}