package L06;

import java.util.Arrays;

public class CircleTest2{
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c1 = new Circle(10, 0);
		Circle c2 = (Circle)c1.clone();
		c1.setR(33);
		c1.setX(11);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
	
}
