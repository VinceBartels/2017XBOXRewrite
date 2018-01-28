package org.usfirst.frc.team5137.robot;

import org.usfirst.frc.team5137.robot.commands.ArcadeDrive;
import org.usfirst.frc.team5137.robot.commands.Climb;
import org.usfirst.frc.team5137.robot.commands.DriveStraight;
import org.usfirst.frc.team5137.robot.commands.Intake;
import org.usfirst.frc.team5137.robot.commands.KillSwitch;
import org.usfirst.frc.team5137.robot.commands.ResetGyro;
import org.usfirst.frc.team5137.robot.commands.Shoot;
import org.usfirst.frc.team5137.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	public Joystick jackBlack;
	
	public JoystickButton shooterButton;
	public JoystickButton climberButton;
	public JoystickButton intakeButton;
	public JoystickButton arcadeModeBumper;
	public JoystickButton tankModeBumper;
	public JoystickButton DriveStraightButton;
	public JoystickButton killSwitchButton;
	public JoystickButton resetGyro;
	
	
	public OI() {
		jackBlack = new Joystick(0);
		climberButton = new JoystickButton(jackBlack, 2); // B
		climberButton.whileHeld(new Climb());
		intakeButton = new JoystickButton(jackBlack, 3); // X
		intakeButton.whileHeld(new Intake());
		shooterButton = new JoystickButton(jackBlack, 4); // Y
		shooterButton.whileHeld(new Shoot()); 
		tankModeBumper = new JoystickButton(jackBlack, 5); // LeftBump
		tankModeBumper.toggleWhenPressed(new TankDrive()); 
		arcadeModeBumper = new JoystickButton(jackBlack, 6); // RightBump
		arcadeModeBumper.toggleWhenPressed(new ArcadeDrive());
		killSwitchButton = new JoystickButton(jackBlack, 8); // Start
		killSwitchButton.toggleWhenPressed(new KillSwitch());
		DriveStraightButton = new JoystickButton(jackBlack,1);
		DriveStraightButton.whileHeld(new DriveStraight());
		resetGyro = new JoystickButton(jackBlack, 7);
		resetGyro.whileHeld(new ResetGyro());
		
		
	}
}
