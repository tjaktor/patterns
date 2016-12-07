package observer;

import java.util.ArrayList;

/**
 * Observer
 */
public class ObserverMain {

	public static void main(String[] args) {
		
		CarBrakeControlUnit unit = new CarBrakeControlUnit();
		
		Brake brakeFR = new Brake( "FrontRightBrake", unit );
		Brake brakeFL = new Brake( "FrontLeftBrake", unit );
		Brake brakeRR = new Brake( "RearRightBrake", unit );
		Brake brakeRL = new Brake( "RearLeftBrake", unit );
		
		
		unit.setStrenghtOfBraking(50);
		
	}

}
