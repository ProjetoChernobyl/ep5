package org.alvorada.cc.ep5;

import java.io.IOException;

/**
 * Faculdades Alvorada de Maringa
 * Disciplina de Lógica de programação orientada a objetos
 * EP5
 * Curso de Ciência da computação
 */
public class Main {
	static String separator = System.getProperty("file.separator");
	public static final String PATH_GENOMA = "resources/genoma";
	public static final String PATH_COOR = "resources/inverte";
	public static final String PATH_OUTPUT_FILE = "resources/out";

	public static Node rootNode = new Node('R');

	public static void main(String[] args) throws IOException {
		
	}
	
	public void start(){
		/* Istanciando objetos das classes utilitárias */
		Reader reader = new Reader();
		Tools tools = new Tools();
		StructBuilder structBuilder = new StructBuilder();
		LinkedList linkedList = new LinkedList();
		Writer writer = new Writer();

		/* Ler o arquivo Genoma */
		String genomaFile = reader.readFile(PATH_GENOMA);

		/* Ler o arquivo de coordenadas inverte */
		String inverteFile = reader.readFile(PATH_COOR);

		/*
		 * Transformando a string do arquivo de coordenadas em numeros para usar
		 * como indices do array facilitando a troca de posições
		 */
		int[] coordenadas = tools.stringToIntArray(inverteFile);

		/*
		 * Salvando os caracteres do arquivo genoma dentro de um objeto node e
		 * colocando esse objeto dentro de um array onde as coordenadas acima
		 * poderão ser usadas para trocar as posições do array
		 */
		Node[] nodes = structBuilder.stringToLinkedListInsideArray(genomaFile);
		
		/* O efetivamente invertendo as posições do array */
		nodes = linkedList.changeSubsequenceSchemaTwo(coordenadas, nodes, rootNode);
		
		String result = rootNode.toString();
		
		/* Retornando o conteúdo alterado e salvando em um arquivo de saída */
		writer.writeFile(PATH_OUTPUT_FILE, result);
	}

}
