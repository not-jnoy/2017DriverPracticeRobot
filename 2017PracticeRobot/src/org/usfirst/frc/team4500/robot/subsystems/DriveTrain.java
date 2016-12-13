package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

	private Victor lTank, rTank;
	private RobotDrive drivetrain;

	public void DriveTrain() {
		lTank = new Victor(RobotMap.LMOTOR);
    	rTank = new Victor(RobotMap.RMOTOR);
    	drivetrain = new RobotDrive(lTank, rTank);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void arcadeDrive(double joyY, double joyTwist) {
    	drivetrain.arcadeDrive(joyY, joyTwist, true);
    }

    public void tankDrive(double leftValue, double rightValue) {
    	drivetrain.tankDrive(leftValue, rightValue);
    }
}