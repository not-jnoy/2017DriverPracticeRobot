package org.usfirst.frc.team4500.robot;

import org.usfirst.frc.team4500.robot.commands.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick stickOne;
	public static Joystick stickTwo;
	Button switchDriveType;


	public OI() {
		stickOne = new Joystick(0);
		stickTwo = new Joystick(1);
		switchDriveType = new JoystickButton(stickOne, 5);
		switchDriveType.whenPressed(new Drive());
	}

	public double getJoyX() {
		return stickOne.getX();
	}

	public double getJoyY() {
		return stickOne.getY();
	}

	public double getJoyTwist() {
		return stickOne.getTwist();
	}

	public double getJoyTwoY() {
		return stickTwo.getY();
	}
}

