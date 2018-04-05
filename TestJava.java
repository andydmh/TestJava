package test_java;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestJava {

	public static void main(String[] args) {
		try {
			String fileName = "test_java.txt"; 
			FileWriter fileWriter = new FileWriter(fileName);
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    
		    printWriter.print("Java " + getVersion() + " is installed.");
		    printWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static String getVersion () {
	    String version = System.getProperty("java.version");
	    int pos = version.indexOf('.', version.indexOf('.')+1);
	    return version.substring (0, pos);
	}
}
