package L08_complete;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException{
		//1) create a stream
		File file = new File("c:/1/test.txt");	
		Scanner sc = new Scanner(file);
		//2) read/write
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
		//3) close stream
		sc.close();
		System.out.println("End");
	}

}
