package L07;

public class Ex5 {

	public static void main(String[] args) {
		int x = 0;	//assume we read a value from user
		System.out.println("main start");
		try {
			compute(x);
		}catch(ArithmeticException e) {
			System.out.println("Main caugh it!!");
		}
		System.out.println("main end");
	}

	private static void compute(int x) {
		try {
			System.out.println("method start");
			System.out.println(6/x); //Arith
			System.out.println("method end");
		} catch(NullPointerException e) {
			System.out.println("Null pointer error!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		} 
	}
}
