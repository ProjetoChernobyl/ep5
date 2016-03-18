package org.alvorada.cc.ep5.io;

import org.junit.Assert;
import org.junit.Test;


public class WriterTest {

	Writer classUnderTest = new Writer();

	@Test
	public void writerFileLineByLineTest() {
		String filePath = "src/test/java/org/alvorada/cc/ep5/files/outputtestfile";
		
		String expected = "testando escrita de arquivo 1515";

		classUnderTest.writeFile(filePath, expected);
		
		Reader reader = new Reader();
		String actual = reader.readFile(filePath);
		
		Assert.assertEquals(expected, actual);
	}

}
