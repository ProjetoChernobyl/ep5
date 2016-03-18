package org.alvorada.cc.ep5.io;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReaderTest {

	@Test
	public void testReadFile() {
		Reader reader = new Reader();
		String separator = System.getProperty("file.separator"); 
		final String PATH_GENOMA = "resources" + separator + "genoma";
		final String PATH_COOR = "resources" + separator + "inverte";
		reader.readFile(PATH_GENOMA, PATH_COOR);
	}

//	@Test
//	public void testReadFileToArray() {
//		fail("Not yet implemented");
//	}

}
