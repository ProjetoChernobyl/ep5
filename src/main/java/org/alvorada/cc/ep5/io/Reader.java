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

	public String readFile(String filePath) {
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

	public String readFileToArray(String filePath) {

		Path coordenada = Paths.get(filePath);
		String string = null;
		
		try {
			
			BufferedReader reader = Files.newBufferedReader(coordenada, utf8);
			string = reader.readLine();

		} catch (Exception e) {
			
		}
		return string;
	}
}
