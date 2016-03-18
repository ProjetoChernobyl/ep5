package org.alvorada.cc.ep5.util;

public class Tools {
	
	private int[] invertsInt;
	
	public int[] stringToIntArray(String readFile) {
		

		String[] invertsString = readFile.split(" ");

		this.invertsInt = new int[invertsString.length];
		
		for (int i = 0; i < invertsString.length; i++) {
			this.invertsInt[i] = Integer.parseInt(invertsString[i]);
		}
		return invertsInt;
	}
}
