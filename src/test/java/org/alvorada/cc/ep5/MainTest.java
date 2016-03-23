package org.alvorada.cc.ep5;


import org.alvorada.cc.ep5.io.Reader;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
	
		
	@Test
	public void testMain() {
		Reader reader = new Reader();
		Main main = new Main();
		
		main.start();
		
		String actual = reader.readFile(Main.PATH_OUTPUT_FILE);
		String expected = "TTGTCACATG";
		Assert.assertEquals(expected, actual);
	}

}
