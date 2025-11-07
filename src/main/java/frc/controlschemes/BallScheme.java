package frc.controlschemes;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.BallControl.BallControl;
import frc.robot.Subsystems.Drive.Drive;

public class BallScheme {
    private static CommandXboxController controller;
    public static void configure(BallControl ballControl, int port){
        controller = new CommandXboxController(port);
        configureBalls(ballControl);
    }
    private static void configureBalls(BallControl ballControl){
        RunCommand defaultIntake = new RunCommand(()->{
            controller.rightBumper().onTrue(new Command() {
               ballControl.forward();
            });
        }, ballControl);
        ballControl.setDefaultCommand(defaultIntake);
    }
}