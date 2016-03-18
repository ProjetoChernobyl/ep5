package org.alvorada.cc.ep5.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tools {
	
	private int[] invertsInt;
	
	public int[] stringToIntArray()throws IOException {
		
		readFile = new BufferedReader(new FileReader(filePath));
		String[] invertsString = readFile.readLine().split(" ");

		this.invertsInt = new int[invertsString.length];
		
		for (int i = 0; i < invertsString.length; i++) {
			this.invertsInt[i] = Integer.parseInt(invertsString[i]);
		}
		return invertsInt;
	}
}
