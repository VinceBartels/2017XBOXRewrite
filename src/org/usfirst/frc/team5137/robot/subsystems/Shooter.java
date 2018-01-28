package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	Spark feederMotor = RobotMap.feederMotor;
	Spark shooterMotor = RobotMap.shooterMotor;
	
	protected void initDefaultCommand() {
		//setDefaultCommand(new Shoot());
	}

	public void shoot() {
		shooterMotor.set(1);
		Timer.delay(0.5);
		feederMotor.set(1);
	}

	public void stop() {
		shooterMotor.set(0);
		feederMotor.set(0);
	}

}
