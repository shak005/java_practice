package com.collections;
import java.util.*;

public class RemoverDuplicatesProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array values:");
		for(int j=0; j<n;j++) {
			arr[j]=sc.nextInt();
		}
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i=0; i<arr.length;i++) {
			t.add(arr[i]);
		}
		System.out.println(t);
	}
}