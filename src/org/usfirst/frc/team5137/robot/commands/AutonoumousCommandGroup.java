package org.usfirst.frc.team5137.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonoumousCommandGroup extends CommandGroup {
	public void AutonomousCommandGroup() {
		addSequential(new DisplayValues());
		addParallel(new DriveStraight());
		
		
	}
		
}
