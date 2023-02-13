package L06;

public class Robot implements Cloneable{
	private int x, y;
	private Battery battery;
	
	public Robot(int x, int y, int charge) {
		setX(x);
		setY(y);
		setBattery(new Battery(charge));
	}
	public Robot(int x, int y, Battery battery) {
		setX(x);
		setY(y);
		setBattery(battery);
	}
	
	public void setCharge(int charge) {
		battery.setCharge(charge);
	}
	public int getCharge() {
		return battery.getCharge();
	}
	
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	//deep copy
	public Object clone() {
		try {
			Robot r = (Robot) super.clone();
			r.battery = (Battery) battery.clone();
			return r;
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Robot [x=" + x + ", y=" + y + ", charge:" + getCharge() + "]";
	}
}

class Battery implements Cloneable{
	public int charge;

	public Battery(int charge) {
		setCharge(charge);
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}