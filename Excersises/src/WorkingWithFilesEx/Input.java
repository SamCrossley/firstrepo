package WorkingWithFilesEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Input {
	
	protected ArrayList<Person> peopleList2 = new ArrayList<Person>();
	
	public Input() {
		this.peopleList2 = peopleList2;
	}
	

	public ArrayList bufferedRead(String inFile) throws IOException
	{
		
	inFile = "C:\\Users\\Admin\\eclipse-workspace\\Excersises\\src\\WorkingWithFilesEx\\peopleList.txt";	
	BufferedReader bfdIn = new BufferedReader(new FileReader(inFile));
	bfdIn.readLine();
	String input = "";
	while ((input = bfdIn.readLine()) != null) {
		String[] line = input.split(",");
		Person guy = new Person(line[0], line[1], Person.parseInt(line[2]));
		peopleList2.add(guy);
	
	}
	
	bfdIn.close();
	return peopleList2;
	
	
	}
	

	public static char[] toArray(String string) {
	
		return null;
	}

	

	
}
