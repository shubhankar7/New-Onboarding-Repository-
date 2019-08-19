package com.amdocs;
import java.util.*;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		numbers.add(110);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		numbers.add(104);
		System.out.println("Size ==="+numbers.size());
		
		for(int element : numbers)
			System.out.println(element);
		
		Collections.sort(numbers);
		System.out.println("Sorted array");
		for(int element : numbers)
		{
			System.out.println(element);
		}
		
	}
	
	
		

}
