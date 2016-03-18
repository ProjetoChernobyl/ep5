package org.alvorada.cc.ep5.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {

	@SuppressWarnings({ "resource", "unused" })
	public String readFile(String filePath, String coor) {
		// TODO le o arquivo Genoma que contém uma linha
		Path genoma = Paths.get(filePath);
		Path coordenada = Paths.get(coor);

		BufferedReader readerGenoma = null;
		BufferedReader readerCoordenada = null;

		readerGenoma = new BufferedReader(readerGenoma);
		readerCoordenada = new BufferedReader(readerCoordenada);

		return null;
	}

	// public int[] readFileToArray(String filePath){
	// // TODO talvez não seja necessário ele lê um arquivo e retorna um array
	// de inteiros
	// return null;
	// }
}
