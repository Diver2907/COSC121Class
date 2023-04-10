package L07;

public class Ex4 {

	public static void main(String[] args) {
		int x = 0;	//assume we read a value from user
		System.out.println("main start");
		try {
			compute(x);
		}catch(ArithmeticException e) {
			System.out.println("Arith exceptoin!");
		}
		System.out.println("main end");
	}

	private static void compute(int x) throws ArithmeticException{
		System.out.println("method start");
		System.out.println(6/x);
		System.out.println("method end");
		System.out.println("Going back to main now");
	}
}
