package L08_complete;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		//1) create a stream
		try {
			URL url = new URL("http://ok.ubc.ca");
			Scanner sc = new Scanner(url.openStream());
			//2) read/write
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
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
