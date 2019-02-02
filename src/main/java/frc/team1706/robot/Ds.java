package frc.team1706.robot;

import edu.wpi.first.wpilibj.RobotController;;

class Ds {

	//private static DriverStation RobotController = DriverStation.getInstance();

	static double getBatteryVoltage() {
		return RobotController.getBatteryVoltage();
	}
}
