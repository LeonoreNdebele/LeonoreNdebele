package oopsConcept;

public class InheritanceBicycleExample {

	// the InheritanceBicycleExample class has two fields
	public int gear;
	public int speed;

	// the InheritanceBicycleExample class has one constructor
	public InheritanceBicycleExample(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;

	}
	// the InheritanceBicycleExample class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
 
    public void speedUp(int increment)
    {
        speed += increment;
    }
    
    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("Number of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
    
 // derived class
    public static class MountainBike extends InheritanceBicycleExample {
     
        // the MountainBike subclass adds one more field
        public int seatHeight;
     
        // the MountainBike subclass has one constructor
        public MountainBike(int gear, int speed,
                            int startHeight)
        {
            // invoking base-class(Bicycle) constructor
            super(gear, speed);
            seatHeight = startHeight;
        }
     
        // the MountainBike subclass adds one more method
        public void setHeight(int newValue)
        {
            seatHeight = newValue;
        }
        
     // overriding toString() method
        // of Bicycle to print more info
        @Override public String toString()
        {
            return (super.toString() + "\nseat height is "
                    + seatHeight);
        }
    }
 // driver class
    public class Test {
        public static void main(String args[])
        {
     
        	MountainBike mb = new MountainBike(3, 100, 25);
        	mb.applyBrake(2);
            System.out.println(mb.toString());
        }
    }
	
}
