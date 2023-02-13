package L08_complete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class Ex7 {

	public static void main(String[] args) {
		//1) create a stream
		try (BufferedReader sc = new BufferedReader(new FileReader("c:/1/test.txt"))) {
			//2) read/write
			String s;
			
			while((s = sc.readLine()) != null) {
				System.out.println(s);
			}
		}catch(InputMismatchException e) {
			System.out.println("Invalid File format");
		}catch(IOException e) {
			System.out.println("File reading error");
			
		}
		System.out.println("End");
	}

}
