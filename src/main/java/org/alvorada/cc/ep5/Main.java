package org.alvorada.cc.ep5;

import java.io.IOException;

import org.alvorada.cc.ep5.io.Reader;
import org.alvorada.cc.ep5.lists.LinkedList;
import org.alvorada.cc.ep5.lists.StructBuilder;
import org.alvorada.cc.ep5.util.Tools;

/**
 * Hello world!
 *
 */
public class Main {
	static String separator = System.getProperty("file.separator");  
	public static final String PATH_GENOMA = "resources" + separator + "genoma";
	public static final String PATH_COOR = "resources" + separator + "inverte";
	public static final String PATH_OUTPUT_FILE = "resources" + separator + "out";
	
	
    @SuppressWarnings("unused")
	public static void main( String[] args ){
    	
    	Reader reader = new Reader();
    	String a = reader.readFile(PATH_GENOMA,PATH_COOR);

    	Tools tools = new Tools();
    	StructBuilder structBuilder = new StructBuilder();
    	LinkedList linkedList = new LinkedList();
    	
    	System.out.println(a);
    	
    }
}
