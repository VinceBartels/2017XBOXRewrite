package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	public TankDrive() {
		requires(Robot.driveTrain);
	}
	
	protected void execute() {
		Robot.driveTrain.tankDrive(Robot.oi.jackBlack);
	}

	protected void interrupted() {
		Robot.driveTrain.stop();
	}

	protected boolean isFinished() {
		return false;
	}
	
}
