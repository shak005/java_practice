package javacodes;

import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int x = scan.nextInt();
		System.out.println("Enter the number of column :");
		int y = scan.nextInt();
		System.out.println("Enter the matrix values : ");
		int[][] arr = new int[x][y];
		for(int r=0; r<x; r++) {
			for(int c=0; c<y; c++) {
				arr[r][c] = scan.nextInt();
			}
		}
		for(int r=0; r<x; r++) {
			for(int c=0; c<y; c++) {
				System.out.print(arr[r][c]);
			}
		}
	}
}
