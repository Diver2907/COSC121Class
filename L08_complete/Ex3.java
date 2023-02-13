package L08_complete;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//1) create a stream
		try {
			File file = new File("c:/1/test3.txt");	
			Scanner sc = new Scanner(file);
			//2) read/write
			while(sc.hasNext()) {
				String name = sc.next();
				int age = sc.nextInt();
				System.out.println(name + " is " + (age+1));
			}
			//3) close stream
			sc.close();
		}catch(InputMismatchException e) {
			System.out.println("Invalid File format");
		}catch(IOException e) {
			System.out.println("File reading error");
			
		}
		System.out.println("End");
	}

}
