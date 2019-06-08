package com.designpattern.creative.singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {
		
	}

	private static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public static void main(String [] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance1 == instance2);
	}
}
