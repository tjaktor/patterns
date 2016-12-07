package observer;

public class Brake implements Brakeable {
	
	private String name;
	private ObservableBrakingUnit brakingUnit;
	
	public Brake( String name, ObservableBrakingUnit brakingUnit )
	{
		this.name = name;
		this.brakingUnit = brakingUnit;
		this.brakingUnit.addBrake( this );
	}
	
	public void activateBrake()
	{
		System.out.println( this.name + " activated!");
	}
	
	public void deactivateBrake()
	{
		System.out.println( this.name + " de-activated!");
	}
	
}
