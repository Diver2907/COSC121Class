package L08_complete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = -1;

		boolean done = false;
		while(!done) {
			try {
				System.out.println("Age? ");
				age = sc.nextInt();
				// valid: positive integer
				while (age < 0) {
					System.out.println("Age must be poitive. Try again:");
					age = sc.nextInt();
				}
				done = true;
			} catch (InputMismatchException e) {
				System.out.println("Age must be int. Try again: ");
				sc.nextLine();
			}
		}
		
		System.out.println("You are " + age + " years old.");
		sc.close();
	}

}
