package WorkingWithFilesEx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Output {
	



public Output(ArrayList<Person> list, File newFile) {
	ArrayList<Person> peopleList = list;
	
	
	
	
}
	
	public static void bufferedWrite(ArrayList<Person> peopleList, File newFile) throws IOException
	{
		BufferedWriter bfdOut = new BufferedWriter(new FileWriter(newFile));
		String line = "";
		
		for(Person p : peopleList) {
			line = p.toFile();
			bfdOut.write(line +" \n");
		}
		bfdOut.close();
		
		
		
		
		
		
		
	}


}
