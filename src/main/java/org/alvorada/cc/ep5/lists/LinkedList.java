package org.alvorada.cc.ep5.lists;

import org.alvorada.cc.ep5.Main;
import org.alvorada.cc.ep5.domain.Node;

public class LinkedList {

	public String [] changeSubsequence(int[] coordenadasDasSubsequencias, String string) {
		// TODO inverter subsequencias de bases
		int contador =0;
		String [] array = string.split("");
		for (int i = 0; i < coordenadasDasSubsequencias.length -1; i++) {
			
		String aux = array[contador];
    	array[contador]= array[contador++];
    	array[contador++]= aux;
    	contador ++;
    	System.out.println(contador );
    	
		}
    	
		for (int i = 0; i < array.length; i++) {

			//Main.root.addInthefirst(array[i]);
		}
		return array;
	}
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		int[]array={1,4,2,3};
		a.changeSubsequence(array, "popeie");
	}

}
