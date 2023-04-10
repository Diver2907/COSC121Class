package L07;

public class Ex7 {
	public static void main(String[] args) {
		int x = 0;	//assume we read a value from user
		System.out.println("main start");
		compute(x);
		System.out.println("main end");
	}
	private static void compute(int x) {
		System.out.println("method start");
		try {
			System.out.println("try start");
			System.out.println(6/x); //Arith
			System.out.println("try end");
		} catch (NullPointerException e) {
			System.out.println("Arith Ex");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("method end");
	}
}
