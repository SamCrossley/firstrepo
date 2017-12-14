package WorkingWithFilesEx;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Person> peopleList = new ArrayList<Person>();
		ArrayList<Person> peopleList2 = new ArrayList<Person>();
		
		Person p1 = new Person("Sandra", "Receptionist", 43);
		Person p2 = new Person("Mark", "Unemployed", 27);
		Person p3 = new Person("Davina", "Dentist", 34);
		Person p4 = new Person("Callum", "Mechanic", 22);
		Person p5 = new Person("Deborah", "Teacher", 36);
		Person p6 = new Person("Irene", "Banker", 48);
		Person p7 = new Person("Frank", "IT Consultant", 38);
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		peopleList.add(p5);
		peopleList.add(p6);
		peopleList.add(p7);
		
		File newFile = new File("C:\\Users\\Admin\\eclipse-workspace\\Excersises\\src\\WorkingWithFilesEx\\peopleList.txt");
		try {
			Output.bufferedWrite(peopleList, newFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
		System.out.println(Arrays.toString(peopleList2.toArray()));
		
		
		
	}

}
