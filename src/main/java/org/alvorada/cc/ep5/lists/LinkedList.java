package org.alvorada.cc.ep5.lists;

import java.util.Arrays;

public class LinkedList {

	public String changeSubsequence(int[] coordenadasDasSubsequencias, String string) {
		// TODO inverter subsequencias de bases
		String[] arrayString = string.split("");
		int contador = 0;
		for (int i = 0; i < coordenadasDasSubsequencias.length - 1; i++) {
			String aux = arrayString[coordenadasDasSubsequencias[i]];
			arrayString[coordenadasDasSubsequencias[i]] = arrayString[coordenadasDasSubsequencias[i + 1]];
			arrayString[coordenadasDasSubsequencias[i + 1]] = aux;
			i++;
			System.out.println(Arrays.toString(arrayString));

			System.out.println(i);
		}
		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < arrayString.length; i++) {
			builder.append(arrayString[i]);
		}

		return builder.toString();
	}

}
