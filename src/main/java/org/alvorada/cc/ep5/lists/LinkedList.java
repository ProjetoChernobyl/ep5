package org.alvorada.cc.ep5.lists;

import java.util.Arrays;

import org.alvorada.cc.ep5.Main;
import org.alvorada.cc.ep5.domain.Node;

public class LinkedList {

	public String[] changeSubsequence(int[] coordenadasDasSubsequencias, String string) {
		// TODO inverter subsequencias de bases
		String[] arrayString = string.split("");
		int contador = 0;
		for (int i = 0;i< coordenadasDasSubsequencias.length-1;i++) {
			String aux = arrayString[coordenadasDasSubsequencias[i]];
			arrayString[coordenadasDasSubsequencias[i]] = arrayString[coordenadasDasSubsequencias[i + 1]];
			arrayString[coordenadasDasSubsequencias[i + 1]] = aux;
			i++;
			System.out.println(Arrays.toString(arrayString));
			
			System.out.println(i);
		}

		// Main.root.addInthefirst(array[i]);
		System.out.println(Arrays.toString(arrayString));
		return arrayString;
	}

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		int[] array = {1,4,2,3,5,7,8,9};
		a.changeSubsequence(array, "ABCDEFG48");
	}

}
