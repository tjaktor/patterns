package entities;

public abstract class Auto {
	
	protected String name;
	protected int maxSpeed;
	protected int seats;
	
	public String name() {
		return name;
	}
	
	public int topSpeedOfTheCar() {
		return maxSpeed;
	}
	
	public int numberOfSeats() {
		return seats;
	}
	
	public String drive()
	{
		String text = this.name + " driving around!";
		return text;
	}
}
