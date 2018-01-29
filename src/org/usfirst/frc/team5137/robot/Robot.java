/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5137.robot;

import org.usfirst.frc.team5137.robot.commands.AutonoumousCommandGroup;
import org.usfirst.frc.team5137.robot.subsystems.Climber;
import org.usfirst.frc.team5137.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5137.robot.subsystems.Shooter;
import org.usfirst.frc.team5137.robot.subsystems.IntakeRoller;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
	
    public static DriveTrain driveTrain;
    public static Shooter shooter;
    public static IntakeRoller intakeRoller;
    public static Climber climber;
    public static Timer timer = new Timer();
    public static UsbCamera camera;
    
    public static OI oi;
	Command autonomousCommand;

    public void robotInit() {
	    RobotMap.init();
	   	RobotMap.gyro.calibrate();
	   	driveTrain = new DriveTrain();
	   	shooter = new Shooter();
	   	intakeRoller = new IntakeRoller();
    	climber = new Climber();
    	camera = CameraServer.getInstance().startAutomaticCapture();
    	camera.setResolution(1280, 720);
    	
    	oi = new OI(); //must be instantiated AFTER all the subsystems
    	autonomousCommand = new AutonoumousCommandGroup();
    	
    }
    
    /**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
    public static void resetTimer() {
    	timer.reset();
    	
    }
    public void disabledInit() {
    
    }
    
    public void disabledPeriodic() {
    		//Scheduler.getInstance().run();
    }
    
    public void autonomousInit() {
    	if (autonomousCommand != null) autonomousCommand.start();
    	timer.reset();
    	timer.start();
    	
    }
    
    public void autonomousPeriodic() {
		Scheduler.getInstance().run();
    }
    
    public void teleopInit() {
    	 if (autonomousCommand != null)
		autonomousCommand.cancel();
    }
    
	public void teleopPeriodic() {
	    Scheduler.getInstance().run();
	}
	
	public void testPeriodic() {
		//called periodically during test mode, whatever that means
	}
}

