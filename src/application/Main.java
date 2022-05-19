package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
   
		method1();
		
		System.out.println("End of program");
	}
	
	public static void method1(){
		
		System.out.println("**** METHOD1 START ***");
		method2();
		System.out.println("**** METHOD1 STOP ***");
		
	}
	
	public static void method2() {
		
		System.out.println("**** METHOD2 START ***");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int  position = sc.nextInt();
			System.out.println(vect[position]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException erro001 ) {
			
			System.out.println("Invalid position!");
			erro001.printStackTrace();
			
			
		}
		
		catch(InputMismatchException erro002){
			
			System.out.println("Input error");
			erro002.printStackTrace();
			
		}
		
		
		System.out.println("**** METHOD2 STOP ***");
		sc.close();
		
	}

}
