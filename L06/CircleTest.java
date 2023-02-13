package L06;

import java.util.Arrays;

public class CircleTest{
	public static void main(String[] args) {
		Circle c1 = new Circle(10, 0);
		Circle c2 = new Circle(7, 5);
		Circle c3 = new Circle(17, 2);

		if(c1.compareTo(c2)>0) 
			System.out.println("c1 is larger");
		else
			System.out.println("c2 is larger");
		//------------
		Circle[] circles = {c1, c2, c3};
		Arrays.sort(circles);
		for (int i = 0; i < circles.length; i++) {
			System.out.println(circles[i].toString());
		}
	}
	
}
