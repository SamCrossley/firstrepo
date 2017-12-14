package TestCodenames;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Codenames.WordBank;

public class WordBankTest {

	@Test
	public void testToStringNotNull() {
		WordBank wordTest = new WordBank("Word");
		assertNotNull(wordTest.toString());
	}
	@Test
	public void testArrayBank() {
		WordBank wordTest = new WordBank("");
		assertNotNull(wordTest.getBank1());
	}
	@Test
	public void read() throws IOException {
		WordBank wordTest = new WordBank("");
	    assertEquals("Failed did not match textFile", wordTest.bufferedRead(), wordTest.getBank1());
	}
}

