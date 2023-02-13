package L06;

public interface Edible {
	public abstract void howToEat();
	public default void foo() {
		System.out.println("FOO");
	}	
}

class Orange implements Edible{
	public void howToEat() {
		System.out.println("Peel then eat.");
	}
}

