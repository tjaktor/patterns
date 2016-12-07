package observer;

public class Brake implements Brakeable {
	
	private String name;
	private ObservableBrakingUnit brakingUnit;
	private int brakingPower;
	
	public Brake( String name, ObservableBrakingUnit brakingUnit )
	{
		this.name = name;
		this.brakingUnit = brakingUnit;
		this.brakingPower = 0;
		this.brakingUnit.addBrake( this );
	}
	
	public void disconnectFromUnit()
	{
		this.brakingUnit.removeBrake( this );
	}
	
	public void updateBraking( int power )
	{
		this.brakingPower = power;
		System.out.println( this.name + " braking at "+ this.brakingPower + "%!");
	}
}
