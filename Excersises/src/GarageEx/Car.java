package GarageEx;

public class Car extends Vehicle {
	
	private int doors;
	private String fuelType;
	private String type; 

public Car(String id, String name, int wheels, int speed, int seats, String colour, double engineSize, int price, int doors, String fuelType, String type) {
		super(id, name, wheels, speed, seats, colour, engineSize, price);

		this.doors = doors;
		this.fuelType = fuelType;
		this.type = type;
		
}public String toString() {
	return "Registration:" + getId() + " Name:" + getName() + " Wheels:" + getWheels() + " Speed:" + getSpeed() + " no. of seats:" + getSeats() + " colour:" + getColour() + " Engine Size:" + getEngineSize() + " Price:" + getPrice() + " no.Doors:" + doors + " Fuel Type:" + fuelType + " Type:" + type;
}
public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
