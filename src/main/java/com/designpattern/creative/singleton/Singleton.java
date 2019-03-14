package com.designpattern.creative.singleton;

public class Singleton {
	
	public static Singleton instance = null;
	
	/* 私有构造方法，防止被实例化 */  
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public static void main(String [] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance1 == instance2);
		// output:true
	}
}
