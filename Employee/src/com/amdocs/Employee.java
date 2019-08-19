package com.amdocs;

public class Employee {
	private String name;
	private String designation;
	private String department;
	
	Address address;

	
	public Employee(String name, String designation, String department, Address address) {

		this.address=address;
		this.name = name;
		this.designation = designation;
		this.department = department;
	}
	public String getDetails() {
		return 
	"name="+name+
	"designation="	+ designation +
	"department="+department+
	"door="+address.doorNo+
	"street"+address.street+
	"city="+address.city+
	"pin="+address.pinCode;
	};
	
	

}
