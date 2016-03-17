package br.com.logicaProgramacao_EP5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenomaHumano {
   public static void main(String[] args) {
	new InputArquivo();
}
}
class InputArquivo{
	Path genoma;
	Path coordenada;
	Charset utf8;
	
	public InputArquivo(){
		
		this.genoma = Paths.get("C:\\Users\\BmLeonardo\\Desktop\\Leonardo -CFC\\workspace\\LogicaProgramacao\\src\\main\\java\\br\\com\\logicaProgramacao_EP5\\genoma.txt");
		this.coordenada = Paths.get("C:\\Users\\BmLeonardo\\Desktop\\Leonardo -CFC\\workspace\\LogicaProgramacao\\src\\main\\java\\br\\com\\logicaProgramacao_EP5\\coor.txt");
		this.utf8 = StandardCharsets.UTF_8;
		
		try {
			
			BufferedReader readerGenoma = Files.newBufferedReader(genoma, utf8);
			String stringGenoma = readerGenoma.readLine();
			
			BufferedReader readerCoordenada = Files.newBufferedReader(coordenada, utf8);
			String stringCoor = readerCoordenada.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}



