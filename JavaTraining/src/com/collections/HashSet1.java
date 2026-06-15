package com.collections;
import java.util.*;
import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args){
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(1000);
		s.add(2000);
		s.add(3000);
		s.add(null);
		s.add(1000);
		s.add(2001);
		System.out.println(s);
	}
}