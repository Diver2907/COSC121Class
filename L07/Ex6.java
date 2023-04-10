package L07;

public class Ex6 {
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
		} catch(NullPointerException e) {
			System.out.println("Null pointer error!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		} catch (ArithmeticException e) {
			System.out.println("Arith Ex");
		} catch (RuntimeException e) {
			System.out.println("Runtime Ex");
		} catch(Exception e) {
			System.out.println("Ex");
		} 
		System.out.println("method end");
	}
}
