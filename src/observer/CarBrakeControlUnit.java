package observer;

import java.util.ArrayList;

public class CarBrakeControlUnit implements ObservableBrakingUnit {
	
	private ArrayList<Brakeable> brakes = new ArrayList<>();
	private int brakingPower;
	
	public CarBrakeControlUnit()
	{
		this.brakingPower = 0;
	}
	
	public void setStrenghtOfBraking( int percents )
	{
		this.brakingPower = percents;
		this.update();
	}
	
	public void addBrake( Brakeable brake )
	{
		this.brakes.add( brake );
	}
	
	public void removeBrake( Brakeable brake )
	{
		this.brakes.remove( brake );
	}
	
	public void update()
	{
		for (Brakeable brakeable : brakes) {
			brakeable.updateBraking( this.brakingPower );
		}
	}		
}
