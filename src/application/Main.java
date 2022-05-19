package application;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(file);
			
			while (sc.hasNextLine()){
				
				System.out.println(sc.nextLine());
			 }
			}
			
		catch(FileNotFoundException erro ) {
			
			System.out.println("Error opning the file: " + erro.getMessage());
		}
		finally {
			
			if(sc != null) {
				
				sc.close();
				
				System.out.println("Scanner close");
			}
			
			System.out.println("Finally block executed");
		
		  }
		}

		
	}


