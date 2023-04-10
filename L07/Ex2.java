package L07;

public class Ex2 {

	public static void main(String[] args) {
		int x = 0;	//assume we read a value from user
		System.out.println("main start");
		compute(x);
		System.out.println("main end");
	}

	private static void compute(int x) {
		try {
			System.out.println("method start");
			System.out.println(6/x);
			System.out.println("method end");
		} catch (Exception e) {
			System.out.println("Cannot divide by 0");
		}
	}
}
