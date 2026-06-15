package methods;
import java.util.*;

public class SecondLargest {
	public static void main(String[]args) {
		System.out.println("Enter a number n : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+",");
		}
		
	}
	}
