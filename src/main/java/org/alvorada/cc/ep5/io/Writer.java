package org.alvorada.cc.ep5.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	String separator = System.getProperty("file.separator");
	String caminhoArquivo = "resources" + separator + "genoma";

	public String writeFile(String twistedGenomaLine) {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(
					new FileWriter(caminhoArquivo));
			writer.write(twistedGenomaLine);

		} catch (IOException e) {
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}
		return twistedGenomaLine;
	}
}
