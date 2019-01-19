package org.usfirst.frc.team3515.robot.subsystems;

import org.usfirst.frc.team3515.robot.RobotMap;
import org.usfirst.frc.team3515.robot.commands.CmdJoystickDrive;


import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivebase extends Subsystem {
	private Talon leftMotor;
	private Talon rightMotor;
	DifferentialDrive drivebase;
	
	public Drivebase() {
		leftMotor = new Talon(RobotMap.LEFT_MOTOR.value);
		leftMotor = new Talon(RobotMap.RIGHT_MOTOR.value);
		drivebase = new DifferentialDrive(leftMotor, rightMotor);
	}
	
	public void drive(double power, double angle) {
		drivebase.arcadeDrive(power, angle, true);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CmdJoystickDrive());
	}

}
