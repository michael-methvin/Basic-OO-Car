
public class Car extends Vehicle {
	/* Car variables created here. Added currentGear to keep track of the gear based on velocity.
	 * Removed numDoors because the variable could change based on the type of car so it 
	 * seemed more intuitive to put it inside the specific car class instead
	 */
	private int numWheels = 4;
	private int numGears = 5;
	private boolean isManual = true;
	private int currentGear = 1;
	
	// Constructor which inherits from the Vehicle class
	public Car(String name, int velocity, int direction, double engineSize, int numWheels,  int numGears, boolean isManual) {
		super(name, velocity, direction, engineSize);
		this.numWheels = numWheels;
		this.numGears = numGears;
		this.isManual = isManual;
	}
	// Getters for isManual and numWheels to use within the toString in Lotus
	public boolean getIsManual() {
		return isManual;
	}
	public int getNumWheels() {
		return numWheels;
	}
	// Mutator used to keep track of the current gear and shift to the appropriate gear based on velocity
	public void shiftGear() {
		System.out.print("Shift from gear " + this.currentGear + " to gear ");
		
		if(getVelocity() < 0) {
			currentGear = 0;
		}
		if(getVelocity() > 0 && getVelocity() <= 10) {
			currentGear = 1;
		}
		if(getVelocity() > 10 && getVelocity() <= 20) {
			currentGear = 2;
		}
		if(getVelocity() > 21 && getVelocity() <= 30) {
			currentGear = 3;
		}
		if(getVelocity() > 31 && getVelocity() <= 40) {
			currentGear = 4;
		}
		if(getVelocity() > 41) {
			currentGear = 5;
		}
		System.out.println(this.currentGear);
	}
	public String toString() {
		String s = super.toString() +
				   "# of Wheels = " + getNumWheels() + "\n" +
				   "isManual = " + getIsManual() + "\n";
		return s;
	}
}
