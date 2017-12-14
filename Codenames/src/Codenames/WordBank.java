package Codenames;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;



public class WordBank {

	private String word;
	ArrayList<WordBank> words = new ArrayList<WordBank>();
	ArrayList<WordBank> bank1 = new ArrayList<WordBank>();

	public WordBank(String word) {

		this.word = word;
	}

	// Reads the textFile and returns only 25 words for the grid
	public ArrayList<WordBank> bufferedRead() throws IOException {

		@SuppressWarnings("resource")
		BufferedReader bfdIn = new BufferedReader(new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Codenames\\src\\Codenames\\bank1.txt"));
		bfdIn.readLine();
		String input = "";
		while ((input = bfdIn.readLine()) != null) {
			String[] line = input.split(",");
			WordBank word = new WordBank(line[0]);
			bank1.add(word);

		}
		Collections.shuffle(bank1);
		while (bank1.size() > 25) {

			bank1.remove(0);
		}
		return bank1;

	}

	// method to return the arraylist of 25 words from bufferedRead..
	public ArrayList<WordBank> getBank1() {
		return bank1;
	}

	public String toString() {
		return word;
	}
}