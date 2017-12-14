package GarageEx;

public abstract class Vehicle {
	
	private String id;
	private String name;
	private int wheels;
	private int speed;
	private int seats;
	private String colour;
	private double engineSize;
	private int price;

	public Vehicle(String id, String name, int wheels, int speed, int seats, String colour, double engineSize, int price) {
		super();
		this.id = id;
		this.name = name;
		this.wheels = wheels;
		this.speed = speed;
		this.seats = seats;
		this.colour = colour;
		this.engineSize = engineSize;
		this.price = price;
	}
	public String toString() {
		return "Registration:" + id + " Name:" + name + " Wheels:" + wheels + " Speed:" + speed + " no. of seats:" + seats + " colour:" + colour + " Engine Size:" + engineSize + " Price:" + price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
