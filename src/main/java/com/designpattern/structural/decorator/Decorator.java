package com.designpattern.structural.decorator;

public class Decorator implements Sourceable {

	public Sourceable source;
	
	public Decorator(Sourceable source) {
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("before method...");
		source.method();
		System.out.println("after method...");
	}

}
