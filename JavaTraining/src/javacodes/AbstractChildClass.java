package javacodes;

public class AbstractChildClass extends AbstractClass {
	public AbstractChildClass() {
		System.out.println("Inside Abstract Class Constructor");
	}
	
	public void display() {
		System.out.println("Inside the abstractchildClass display");
	}
	
	public void print() {
		System.out.print("INside the print in AbstractChildClass");
	}
	
	void show() {
		System.out.println("Inside the show() function");
	}
	
	public static void main(String[] args) {
		AbstractChildClass ab = new AbstractChildClass();
		ab.display();
		ab.print();
		ab.show();
	}
}
