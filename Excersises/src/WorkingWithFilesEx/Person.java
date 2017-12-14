package WorkingWithFilesEx;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private String occupation;
	private int age;

	public Person(String name, String occupation, int age) {
		super();
		this.setName(name);
		this.setOccupation(occupation);
		this.setAge(age);
	
	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toFile() {
		
		return name + "," + occupation + "," + age ;
	}

	public static int parseInt(String string) {

		return 0;
	}
	
}
