package observer;

public interface ObservableBrakingUnit {
	public void addBrake( Brakeable brake );
	public void removeBrake( Brakeable brake );
	public void update();
}
