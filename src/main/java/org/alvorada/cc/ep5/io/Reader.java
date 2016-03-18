package org.alvorada.cc.ep5.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
	Charset utf8 = StandardCharsets.UTF_8;

	@SuppressWarnings({ "resource", "unused" })
	public String readFile(String filePath) {
		// TODO le o arquivo Genoma que contém uma linha
		Path genoma = Paths.get(filePath);
		String string = null;
		try {
			
			BufferedReader reader = Files.newBufferedReader(genoma, utf8);
			string = reader.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return string;
	}

	public int[] readFileToArray(String filePath) {
		// TODO talvez não seja necessário ele lê um arquivo e retorna um array
		// de inteiros

		Path coordenada = Paths.get(filePath);
		String string = null;
		int[] arrayCoor = null;
		try {
			
			BufferedReader reader = Files.newBufferedReader(coordenada, utf8);
			string = reader.readLine();
			String array[] = string.split(" ");
			arrayCoor = new int[array.length];
			
			for (int i = 0; i < array.length; i++) {
				arrayCoor[i]= Integer.parseInt(array[i]);
			}
			
		} catch (Exception e) {
			
		}
		return arrayCoor;
	}
}
