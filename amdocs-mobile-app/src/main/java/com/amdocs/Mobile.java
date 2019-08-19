package com.amdocs;

public class Mobile {

	private Camera camera;
	
	public Mobile() {
		
		camera=new Camera();
	}
	public Mobile(Camera camera) {
		
		this.camera=camera;
		
	}
	
	public boolean startPhotoApp() {
		
		
		System.out.println("Inside start photo app");		
		if(camera.on()) {
			
			System.out.println("Positive code path");
			System.out.println("assume some harware interaction happens");
			return true;
		}
		
		System.out.println("Negative code path");
		System.out.println("assume exception handling abnd error");
		
		return false;
	}

}
