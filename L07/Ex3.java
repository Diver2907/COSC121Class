package L07;

import L06.Robot;

public class Ex3 {

	public static void main(String[] args) {
		Robot r = null;
		try {
			r.setX(10);
			System.out.println(r);
		}catch(Exception e)
		{
			System.out.println("Error");
		}
		
//		int[] x = {1,2,3};
//		System.out.println(x[9]);
//		
		String s = "afg";
		System.out.println(Integer.parseInt(s));
	}
}
