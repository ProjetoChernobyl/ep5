package org.alvorada.cc.ep5.lists;

import org.alvorada.cc.ep5.domain.Node;

public class LinkedList {

	public Node[] changeSubsequenceSchemaOne(int[] coordenadasDasSubsequencias, Node[] nodes) {
		
		for (int i = 0; i < coordenadasDasSubsequencias.length;) {
			int beginPosition = coordenadasDasSubsequencias[i];
			i++;
			int endPosition = coordenadasDasSubsequencias[i];
			i++;			
			
			int begin = beginPosition - 1; 
			int end = endPosition -1;
			
			int afterBegin = begin -1;
			int afterEnd = end -1;
			int beforeEnd = end +1;
			
			nodes[afterBegin].setNext(nodes[end]);
			nodes[end].setNext(nodes[begin]);
			nodes[afterEnd].setNext(nodes[beforeEnd]);			
		}
		return nodes;
	}
	
public Node[] changeSubsequenceSchemaTwo(int[] coordenadasDasSubsequencias, Node[] nodes) {
		
		for (int i = 0; i < coordenadasDasSubsequencias.length;) {
			int coordenadaInicial = coordenadasDasSubsequencias[i];
			i++;
			int coordenadaFinal = coordenadasDasSubsequencias[i];
			i++;
			
			
			int begin = coordenadaInicial - 1; 
			int end = coordenadaFinal -1;
			
			int afterBegin = begin -1;
			int beforeEnd = end +1;
			
			
			nodes[afterBegin].setNext(nodes[end]);
			
			for (int j = end; j > begin ; j--) {
				nodes[j].setNext(nodes[j-1]);
			}
			
			nodes[begin].setNext(nodes[beforeEnd]);
			
		}
		return nodes;
	}

}
