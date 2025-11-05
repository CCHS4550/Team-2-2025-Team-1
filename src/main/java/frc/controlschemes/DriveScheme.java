package frc.controlschemes;

import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.Drive.Drive;

public class DriveScheme {
    private static CommandXboxController controller;
    private static void configure(Drive drive, int port){
        controller = new CommandXboxController(port);
        configureDrive(drive);
    }
    private static void configureDrive(Drive drive){
        RunCommand defaultDrive = new RunCommand(()->{
            drive.arcade(controller.getLeftY(), controller.getRightX());
        }, drive);
        drive.setDefaultCommand(defaultDrive);
    }
}
