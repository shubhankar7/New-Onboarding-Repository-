package com.amdocs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address= new Address("100", "Stree2","Stree3","713146");
		Employee sharma
			=new Employee(
					"Sharma",
					"Sortware Engineer -I",
					"Digital Express",address
					);
		System.out.println(sharma.getDetails());

	}

}
