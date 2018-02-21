package gererics;

public abstract class Animal<T> {
	protected int eyes;
	protected String color;
	protected String type;

	public Animal() {
		super();
	}

	public Animal(String type) {
		super();
		this.type = type;
	}

	public static void someStaticMethod() {
		System.out.println("testing static method from abstract class");
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void eat() {
		System.out.printf("%s is eating.%n", type);
	}

	public void sleep() {
		System.out.printf("%s is sleeping.%n", type);
	}

	public abstract void move();
}
