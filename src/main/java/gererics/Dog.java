package gererics;


public class Dog extends Animal {
	private int legs;
	
	
	
	public Dog(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public void move() {
		System.out.printf("%s is running.%n", type);
	}
}
