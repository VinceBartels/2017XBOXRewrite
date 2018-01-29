package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DisplayValues extends Command {
	
	public DisplayValues() {
		
	}
	protected void execute() {
		SmartDashboard.putNumber("Angle", RobotMap.gyro.getAngle());
		SmartDashboard.putNumber("Distance", RobotMap.soundMakers.getRangeInches());
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
