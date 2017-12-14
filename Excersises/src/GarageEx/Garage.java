package GarageEx;
import java.util.ArrayList;
import java.util.Scanner;
public class Garage {
	
	
	public static void main(String[] args) {
	
		
		Car c1 = new Car ("BD55", "BMW", 4, 100, 5, "Silver", 1.4, 30000, 5, "Diesel", "Hatchback" );
		Car c2 = new Car ("KK65", "Fiat", 4, 80, 5, "Red", 1.2, 15000, 3, "Petrol", "Convertible" );
		Lorry l1 = new Lorry ("LM45", "Scania", 6, 70, 3, "White", 6.0, 40000, 2, "Trailer", 5, 3);
		Lorry l2 = new Lorry ("ZX35", "Renault", 8, 70, 5, "Blue", 7.0, 50000, 2, "Sleeper Cab", 7, 3);
		MotorCycle m1 = new MotorCycle ("JH17", "Yamaha", 2, 120, 1, "Black", 500, 20000, 150, "Racer");
		MotorCycle m2 = new MotorCycle ("VM88", "triumph", 2, 100, 1, "British Racing Green", 1500, 10000, 200, "Cruiser");
		
		ArrayList<Vehicle> garageList = new ArrayList<Vehicle>();
		garageList.add(c1);
		garageList.add(c2);
		garageList.add(l1);
		garageList.add(l2);
		garageList.add(m1);
		garageList.add(m2);
		
		Scanner s = new Scanner(System.in);
		System.out.println("input registration number");
		String reg = s.nextLine();
		
		System.out.println(fixingCost(garageList, reg));
	}
	
	public static float fixingCost(ArrayList<Vehicle> garageList,String reg) {
		
		float cost = 0f;
		for (Vehicle v : garageList) {
		
			if(reg.equals(v.getId())) {
			
				if(v instanceof Car) {
				cost =  (float) (((Car)v).getDoors() * 50.00);
				
				}else if(v instanceof MotorCycle) {
				
				cost = (float) (((MotorCycle)v).getLength() * 1.50);
				}else {
				
				cost = (float) (((Lorry)v).getWheels() * 35.99);
				}
			
			}else {
				System.out.println("Vehicle not found");
				
				cost = 0;
			}
		
		
		
	}
return cost;
}
}
