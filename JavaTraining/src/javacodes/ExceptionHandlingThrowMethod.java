package javacodes;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandlingThrowMethod {
	public static void main(String[] args) {
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	static void m1() throws FileNotFoundException,ArithmeticException{
		FileReader f = new FileReader("E:\\Content Creation and editing\\text scripts\\PM_post2.txt");
		System.out.println("File opened");
	}
}
