package oopsConcept;

public interface Bicycle {
	public int Gear();
	public int ApplyBrakes();
	public int speedUp();
}

class Mountainbike implements Bicycle {
	
	private int gear;
	private int speed;
	private int brakes;
	
		
	Mountainbike(int gear,int speed,int brakes) {
		this.gear = gear;
		this.speed = speed;
		this.brakes = brakes;
	}

	@Override
	public int Gear() {
		return gear;
	}

	@Override
	public int ApplyBrakes() {
		return brakes;
	}

	@Override
	public int speedUp() {
		return speed;
	}
	
}
