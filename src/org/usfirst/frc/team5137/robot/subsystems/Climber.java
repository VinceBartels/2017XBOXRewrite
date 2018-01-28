package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {

	Spark climberMotor = RobotMap.climberMotor;
	
	protected void initDefaultCommand() {
	
	}
	
	public void climb() {
		climberMotor.set(1);
	}

	public void stop() {
		climberMotor.set(0);
	}

}