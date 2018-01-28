package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Intake extends Command {

	public Intake() {
		requires(Robot.intakeRoller);
	}
	
	protected void execute() {
		Robot.intakeRoller.intake();
	}

	protected void interrupted() {
		Robot.intakeRoller.stop();
	}

	protected boolean isFinished() {
		return false;
	} 
	
}
