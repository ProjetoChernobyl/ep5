package org.alvorada.cc.ep5.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	

	public String writeFile(String filePath, String twistedGenomaLine) {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(
					new FileWriter(filePath));
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
