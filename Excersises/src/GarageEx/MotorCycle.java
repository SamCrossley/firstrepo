package GarageEx;

public class MotorCycle extends Vehicle {
	
	private int length;
	private String type;


	public MotorCycle(String id, String name, int wheels, int speed, int seats, String colour, double engineSize, int price, int length, String type) {
		super(id, name, wheels, speed, seats, colour, engineSize, price);

		this.setLength(length);
		this.type = type;
		
}public String toString() {
	return "Registration:" + getId() + " Name:" + getName() + " Wheels:" + getWheels() + " Speed:" + getSpeed() + " no. of seats:" + getSeats() + " colour:" + getColour() + " Engine Size:" + getEngineSize() + " Price:" + getPrice() + " Length: " +length+ " Type:" + type;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public String getType() {
	return type;
}
public void setType() {
	this.type = type;
}
}
