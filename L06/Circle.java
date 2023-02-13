package L06;

public class Circle implements Comparable<Circle>, Cloneable{
	private double r;
	private int x;
	
	public Circle(double r, int x) {
		this.setR(r);
		this.setX(x);
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getArea() {
		return Math.PI * r * r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		if(r >= 0)
			this.r = r;
		else
			System.out.println("Invalid Radius");
	}

	public String toString() {
		return "radius: " + r + ", X: " + x;
	}
	public int compareTo(Circle other) {
		if(this.r > other.r)
			return +1;
		else if(this.r<other.r)
			return -1;
		else
			return 0;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
