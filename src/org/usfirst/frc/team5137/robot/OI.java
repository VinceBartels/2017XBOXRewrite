package org.usfirst.frc.team5137.robot;

import org.usfirst.frc.team5137.robot.commands.ArcadeDrive;
import org.usfirst.frc.team5137.robot.commands.Climb;
import org.usfirst.frc.team5137.robot.commands.Intake;
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
	
	public OI() {
		jackBlack = new Joystick(0);
		
		climberButton = new JoystickButton(jackBlack, 2);
		climberButton.whileHeld(new Climb());
		intakeButton = new JoystickButton(jackBlack, 3);
		intakeButton.whileHeld(new Intake());
		shooterButton = new JoystickButton(jackBlack, 4);
		shooterButton.whileHeld(new Shoot()); 
		tankModeBumper = new JoystickButton(jackBlack, 5);
		tankModeBumper.toggleWhenPressed(new TankDrive()); 
		arcadeModeBumper = new JoystickButton(jackBlack, 6);
		arcadeModeBumper.toggleWhenPressed(new ArcadeDrive());
	}
}
