// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

enum SPEEDMODE {
  HIGH,
  LOW
}
/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  public Robot() {}

  private SPEEDMODE driveSpeed = SPEEDMODE.HIGH;

  //motors for the drivetrain CHANGE CHANNEL TO PROPER CHANNEL
  private final Spark leftMotor1 = new Spark(0);
  private final Spark leftMotor2 = new Spark(1);
  private final Spark rightMotor1 = new Spark(2);
  private final Spark rightMotor2 = new Spark(3);

  private final DifferentialDrive drive1 = new DifferentialDrive(leftMotor1,rightMotor1);
  private final DifferentialDrive drive2 = new DifferentialDrive(leftMotor2,rightMotor2);

  //Joystick/button board CHANGE PORT TO PROPER PORT
  private final Joystick driveStick = new Joystick(0);
  private final Joystick buttonBoard = new Joystick(1);


  private double autoStartTime;


  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
    autoStartTime = Timer.getFPGATimestamp();
  }

  @Override
  public void autonomousPeriodic() {
    double time = Timer.getFPGATimestamp();
    
    //moves forward for 2 seconds
    if(time - autoStartTime < 2){
      drive1.arcadeDrive(0.6, 0);
      drive2.arcadeDrive(0.6, 0);
    } else {
      drive1.stopMotor();
      drive2.stopMotor();
    }
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    //axis 1 = forward, 4 = turn
    double speed = driveSpeed == SPEEDMODE.HIGH ? driveStick.getRawAxis(1)*Constants.driveConst.speedH : driveStick.getRawAxis(1)*Constants.driveConst.speedL;
    double turn = driveSpeed == SPEEDMODE.HIGH ? driveStick.getRawAxis(4)*Constants.driveConst.turnL : driveStick.getRawAxis(4)*Constants.driveConst.turnL;

    //arcade drive
    drive1.arcadeDrive(speed, turn);
    drive2.arcadeDrive(speed, turn);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
