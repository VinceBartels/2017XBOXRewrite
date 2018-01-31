package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DisplayValues extends Command {
	double scaleFactor = 147;
	
	
	public DisplayValues() {
		
	}
	protected void execute() {
		SmartDashboard.putNumber("Angle", RobotMap.gyro.getAngle()); 
		SmartDashboard.putNumber("Distance1", RobotMap.soundMaker1.getRangeInches()*147);
		SmartDashboard.putNumber("Distance2", RobotMap.soundMaker2.getRangeInches()*147);
		SmartDashboard.putNumber("Distance3", RobotMap.soundMaker3.getRangeInches()*147);
		SmartDashboard.putNumber("Distance4", RobotMap.soundMaker4.getRangeInches()*147);
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
