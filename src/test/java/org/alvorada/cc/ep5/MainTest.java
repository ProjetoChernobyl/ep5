package org.alvorada.cc.ep5;


import org.alvorada.cc.ep5.io.Reader;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
	
		
	@Test
	public void testMain() {
		Reader reader = new Reader();
		Main menu = new Main();
		
		String actual = reader.readFile(menu.PATH_GENOMA);
		String expected = "TTACTGCATG";
		Assert.assertEquals(expected, actual);
	}

}
