package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptionfive {
	public static void main(String[] args) throws FileNotFoundException{
		File file = null;
		try {
			file = new File("E:''file.txt");
			FileReader fr = new FileReader(file);
		}catch(FileNotFoundException f) {
		    System.out.println(file);
		}    
	}

}
