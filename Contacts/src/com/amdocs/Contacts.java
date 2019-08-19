package com.amdocs;

import java.util.HashMap;

public class Contacts {
	private HashMap<String,String> contacts;
	
	public Contacts() {
		this.contacts=new HashMap<String,String>();
	}
	
	public void addContact(String name,String mobileNo)	{
		contacts.put(mobileNo,name);
			
	}
	public String findContactNameBymobileNo(String mobileNo) {
		String name=contacts.get(mobileNo);
		if(name==null)
			return mobileNo;
		else return name;
	}
	public static void main(String[] args) {
		Contacts contacts=new Contacts();
		
		contacts.addContact("Babai","123456789" );
		contacts.addContact("Bubu", "012345678");
		
		String output=contacts.findContactNameBymobileNo("012345678");
		
		System.out.println(output);
		
		
	}

}
