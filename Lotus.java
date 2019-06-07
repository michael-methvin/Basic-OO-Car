
public class Lotus extends Car {
	// Lotus class specific variables added numDoors because it can change based on car type
	private int roadServiceMonths = 0;
	private int currentGear = 0;
	private int numDoors = 2;
	
	// Constructor inherits the Car class which inherits from the Vehicle
	public Lotus(String name, int velocity, int direction, double engineSize, int numWheels, int numDoors, int numGears, boolean isManual, int roadServiceMonths) {
		super(name, velocity, direction, engineSize, numWheels, numGears, isManual);
		this.roadServiceMonths = roadServiceMonths;
		this.numDoors = numDoors;
	}
	// Used to print out all car details to the user in an organized way
	public String toString() {
		String s =  "Car Specifications: " + "\n" +
				   	super.toString() +
				   	"Doors = " + numDoors + "\n" +
				    "Road Service Months = " + roadServiceMonths;
		return s;
	}
}
 