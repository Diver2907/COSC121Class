package L08_complete;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//1) create a stream
		Scanner sc = new Scanner(System.in);
		//2) read/write
		System.out.println("What is your name?");
		String name = sc.nextLine();
		//3) close stream
		sc.close();
	}

}
