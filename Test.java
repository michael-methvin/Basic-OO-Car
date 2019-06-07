/* Used to create a car object that can speed up, slow down, change direction,
 * shift gears, and holds data relating to the type of car created. 
 */
public class Test {

    public static void main(String[] args) {

    	final int roadServiceMonth = 12;
    	//name,velocity,direction,engineSize,numWheels,numDoors,numGears,isManual,roadServiceMonths
    	Lotus lotus = new Lotus("Lotus", 0, 0, 1.8, 4, 2, 5, true, roadServiceMonth);
      	
    	// steer() is defined in Vehicle
    	// start car and accelerate from 0 to 30 mph
    	// show gear setting, and move values(speed,direction) (total speed, direction)
    	lotus.changeVelocity(35);
    	System.out.println("");
    	lotus.shiftGear();
    	lotus.move();
    	
    	 //change direction (steer) 3 times (45, 10, -5) 
    	lotus.steer(40);
    	lotus.steer(15);
    	lotus.steer(-5);
    	
    	// increase speed by 20 ; show gear setting, move values
    	lotus.changeVelocity(25);
    	System.out.println("");
    	lotus.shiftGear();
    	lotus.move();
    	// change direction (20) ; 
    	lotus.steer(25);
    	// change speed by (-20, 5); 
    	lotus.changeVelocity(-20);
    	System.out.println("");
    	lotus.shiftGear();
    	lotus.move();
    	lotus.changeVelocity(5);
    	// change direction (10) : Reduce speed (-10) 
    	System.out.println("");
    	lotus.shiftGear();
    	lotus.move();
    	lotus.steer(12);
    	lotus.changeVelocity(-8);
        System.out.println("");
    	lotus.shiftGear();
        lotus.move();
    	System.out.println("");
        System.out.println(lotus); // toString() in lotus will display the stuff
    }
}
