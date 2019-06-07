
public class Vehicle {
	// Created variables that are base level variables for all Vehicle objects
	private String name = "";
	private int velocity = 0;
	private int direction = 0;
	private double engineSize = 0;
	
	// Explicit Constructor
	public Vehicle(String n, int v, int d, double eS) {
		name = n;
		velocity = v;
		direction = d;
		engineSize = eS;
	}
	// Getters used later for the toString in the Lotus Class and for gear shifting in the Car class
	public double getEngineSize() {
		return this.engineSize;
	}
	public String getName() {
		return this.name;
	}
	public int getVelocity() {
		return this.velocity;
	}
	/* Mutators used to move the Vehicle's direction and velocity.
	 * These return String so that they can be called to relay what's happening to the user.  
	 */
	public void changeVelocity(int velocity) {
		System.out.print("The vehicle changes velocity from " + this.velocity + " ");
		this.velocity += velocity;
		 System.out.println("to " + this.velocity);
		
	}
	public void steer(int direction) {
		System.out.print("Turn from " + this.direction + " ");
		this.direction += direction;
		System.out.println("to " + this.direction);
	}
	public void move() {
		System.out.println("Moving at " + velocity + " in direction " + direction);
		
	}
	public String toString() {
		String s = "Name = " + getName() + "\n" +
				   "Engine size = " + getEngineSize() + "L" + "\n";
		return s;
	}
}
