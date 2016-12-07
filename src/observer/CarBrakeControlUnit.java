package observer;

import java.util.ArrayList;

public class CarBrakeControlUnit implements ObservableBrakingUnit {
	
	private ArrayList<Brakeable> brakes = new ArrayList<>();
	
	public void addBrake( Brakeable brake )
	{
		this.brakes.add( brake );
	}
	
	public void activateBrakes()
	{
		System.out.println( "All the brakes activated!" );
		
		for (Brakeable brakeable : brakes) {
			brakeable.activateBrake();
		}
	}
	
	public void deactivateBrakes()
	{
		System.out.println( "All the brakes de-activated!" );
		
		for (Brakeable brakeable : brakes) {
			brakeable.deactivateBrake();
		}
	}
	
}
