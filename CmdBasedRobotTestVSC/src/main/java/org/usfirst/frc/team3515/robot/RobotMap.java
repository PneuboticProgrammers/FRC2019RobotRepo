/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3515.robot;

public enum RobotMap {
	
	LEFT_MOTOR(0),
	RIGHT_MOTOR(1),
	LEFT_JOYSTICK(2),
	RIGHT_JOYSTICK(3);
	
	public final int value;
	
	RobotMap(int value){
		this.value = value;
	}
}
