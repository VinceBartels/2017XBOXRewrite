package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class KillSwitch extends Command {

	
	public KillSwitch() { 
		requires(Robot.driveTrain);
		requires(Robot.climber);
		requires(Robot.intakeRoller);
		requires(Robot.shooter);
	}
	protected void execute() {
		Robot.driveTrain.stop();
		Robot.climber.stop();
		Robot.intakeRoller.stop();
		Robot.shooter.stop();
	}
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
