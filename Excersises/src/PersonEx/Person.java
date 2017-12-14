package PersonEx;
import java.util.ArrayList;
import java.util.Scanner;


public class Person{
	
	public String name;
	public int age;
	public String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return " Name: " + name +" Age: " + age + " Job: " + jobTitle;
	}
	
	public String name() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Person p1 = new Person ("Dave", 30, "postman" );
		Person p2 = new Person ("Johnny Boy", 18, "Ruffian");
		Person p3 = new Person ("Stuart Little", 67, "Mouse");
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		System.out.println("Who are you looking for?");
		String searchName = s.nextLine();
		
		for(Person i : personList) {
			if(i.name.equals(searchName)) {
				System.out.println(i.toString());
			}else {
				continue;
			}
		}
			
/*		for(int i=0; i<personList.size(); i++) {
			System.out.println(personList.toString());
		}*/
	}

}
	


		
		





