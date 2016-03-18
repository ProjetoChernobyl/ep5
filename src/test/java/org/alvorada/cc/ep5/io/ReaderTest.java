package org.alvorada.cc.ep5.io;

import org.junit.Assert;
import org.junit.Test;

public class ReaderTest {
	
	Reader classUnderTest = new Reader();
		
	@Test
	public void readFileTest() {
		String actual = classUnderTest.readFile("src/test/java/org/alvorada/cc/ep5/files/genoma");
		String expected = "TTACTGCATG";
		Assert.assertEquals(expected, actual);
	}

}
