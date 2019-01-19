/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3515.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	
	public final Joystick LEFT_JOY = new Joystick(RobotMap.LEFT_JOYSTICK.value);
	//public final Joystick RIGHT_JOY = new Joystick(RobotMap.RIGHT_JOYSTICK.value);
	
	public static final double JOYSTICK_DEADZONE = 0.05;
	
	public double getLeftJoyY() {
		double raw = LEFT_JOY.getRawAxis(1);

		return JOYSTICK_DEADZONE > raw ? 0.0 : raw;
	}
	
	public double getRightJoyX() {
		double raw = LEFT_JOY.getRawAxis(4);
		return JOYSTICK_DEADZONE > raw ? 0.0 : raw;
	}
	
	public OI() {
		
	}
	
}
