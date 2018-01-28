package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

	public Shoot() {
		requires(Robot.shooter);
	}
	
	public void execute() {
		Robot.shooter.shoot();
	}
	
	public void interrupted() {
		Robot.shooter.stop();
	}


	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
