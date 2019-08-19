package com.amdocs;

import java.lang.ref.WeakReference;

public class Singleton {
	
	private static WeakReference<Singleton> instance;
	
	private Singleton() {
		System.out.println("Private Constructor Invoked");
		
	}
	
	private synchronized static Singleton getInstance() {
		
		if(instance ==null)
			instance =new WeakReference<Singleton>(new Singleton());
			
		return instance.get();
	}
		
		public static void main(String [] args)
		{
			Singleton instance1= Singleton.getInstance();
			Singleton instance2=Singleton.getInstance();
			
			if(instance1==instance2)
			{
				System.out.println("Both are same");
			}
			else
			{
				System.out.println("Bothn are different");
			}
		}
	}


