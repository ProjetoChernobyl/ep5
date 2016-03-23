package org.alvorada.cc.ep5.lists;

import org.alvorada.cc.ep5.Main;

/**
 * Classe com os métodos para alterar as posições de uma lista
 * 
 * @author ricardo
 *
 */
public class LinkedList {

	/**
	 * Método que inverte a posição das letras trocando os ponteiros "próximo"
	 * dos nós que estão inseridos no array
	 * 
	 * @param coordenadasDasSubsequencias
	 * @param nodes
	 * @return Node[]
	 */
	public Node[] changeSubsequenceSchemaTwo(int[] coordenadasDasSubsequencias, Node[] nodes, Node rootNode) {

		for (int i = 0; i < coordenadasDasSubsequencias.length;) {
			int coordenadaInicial = coordenadasDasSubsequencias[i];
			i++;
			int coordenadaFinal = coordenadasDasSubsequencias[i];
			i++;

			int begin = coordenadaInicial - 1;
			int end = coordenadaFinal - 1;

			if (coordenadaInicial != coordenadaFinal) {

				if (begin == 0) {
					changeInitialPosition(begin, end, nodes, rootNode);
				} else if (coordenadaFinal == nodes.length) {
					changeLastPosition(begin, end, nodes);
				} else {
					changeMiddlePositions(begin, end, nodes);
				}
			}

		}
		return nodes;
	}

	/**
	 * Método chamado para alterar as posições quando a primeira posição a ser
	 * trocada é a posição 0 (inicial) do array
	 * 
	 * @param begin
	 * @param end
	 * @param nodes
	 */
	public void changeInitialPosition(int begin, int end, Node[] nodes, Node rootNode) {
		
		/*
		 * TODO use o código do método midlleposition como exemplo a problema
		 * esta na posição inicial para resolver use o inicio real do aray que é
		 * Main.rootNode ele está na posição -1
		 */
		 
		int beforeBegin = begin - 1;

		int afterEnd = end + 1;
		
		rootNode.setNext(nodes[end-1]);
		
		for (int j = end-1; j > beforeBegin; j--) {
			nodes[j].setNext(nodes[j - 1]);
		}

		nodes[begin].setNext(nodes[afterEnd]);

	}

	/**
	 * Método para alterar posições do array quando a ultima posição a ser
	 * alterada também é a última posição do array
	 * 
	 * @param begin
	 * @param end
	 * @param nodes
	 */
	public void changeLastPosition(int begin, int end, Node[] nodes) {
		int beforeBegin = begin - 1;

		nodes[beforeBegin].setNext(nodes[end]);
		nodes[begin].setNext(null);
		for (int j = end; j > begin; j--) {
			nodes[j].setNext(nodes[j - 1]);
		}

	}

	/**
	 * método chamado para trocar posições que estejam no meio do array de nodes
	 * 
	 * @param begin
	 * @param end
	 * @param nodes
	 */
	public void changeMiddlePositions(int begin, int end, Node[] nodes) {
		int beforeBegin = begin - 1;
		int afterEnd = end + 1;

		nodes[beforeBegin].setNext(nodes[end]);

		for (int j = end; j > begin; j--) {
			nodes[j].setNext(nodes[j - 1]);
		}

		nodes[begin].setNext(nodes[afterEnd]);
	}

}
