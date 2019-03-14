package com.designpattern.behavioral.chainofresp;

public class SimpleHandler extends AbstractHandler implements Handler {

	private String name;
		
	public SimpleHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		
		System.out.println(name + " operate");
		
		if(getHandler() != null) {
			getHandler().operator();
		}
	}
}
