package GarageEx;

public class Lorry extends Vehicle{
	
	private int doors;
	private int loadWeight;
	private int height;
	private String type;
	
	public Lorry(String id, String name, int wheels, int speed, int seats, String colour, double engineSize, int price, int doors, String type, int loadWeight, int height) {
		super(id, name, wheels, speed, seats, colour, engineSize, price);

		this.doors = doors;
		this.loadWeight = loadWeight;
		this.type = type;
		this.height = height;
		
}public String toString() {
	return "Registration:" + getId() + " Name:" + getName() + " Wheels:" + getWheels() + " Speed:" + getSpeed() + " no. of seats:" + getSeats() + " colour:" + getColour() + " Engine Size:" + getEngineSize() + " Price:" + getPrice() + " no.Doors:" + doors + " Type:" + type + " Load Weight:" + loadWeight + " Height:" + height;
}
public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public int getLoadWeight() {
	return loadWeight;
}
public void setLoadWeight(int loadWeight) {
	this.loadWeight = loadWeight;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
