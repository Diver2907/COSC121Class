package L08_complete;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) throws IOException{
		//1) create a stream
//		File file = new File("c:/1/test2.txt");	
		PrintWriter out = new PrintWriter(System.out);
		//2) read/write
		out.println("1zza!");
		out.println("2zzb!");
		
		//3) close stream
		out.close();
		System.out.println("End");
	}

}
