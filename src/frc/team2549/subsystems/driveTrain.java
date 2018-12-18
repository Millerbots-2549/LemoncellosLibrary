package frc.team2549.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;


public class driveTrain extends Subsystem {

    PWMTalonSRX motorOne;
    PWMTalonSRX motorTwo;
    RobotDrive drive;


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public driveTrain(){
        motorOne = new PWMTalonSRX(1);
        motorTwo = new PWMTalonSRX(2);
        drive = new RobotDrive(motorOne,motorTwo);
    }
    public void drive(double left, double right){
        drive.tankDrive(left, right);
    }
}

