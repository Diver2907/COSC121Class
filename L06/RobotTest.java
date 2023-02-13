package L06;

public class RobotTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Robot r1 = new Robot(1,3,90);
		Robot r2 = (Robot)r1.clone();
		
		r1.setX(0);
		r1.setY(0);
		r1.setCharge(50);
		
		System.out.println(r1);
		System.out.println(r2);
	}
	
}