package com.designpattern.creative.builder;

public class BuilderTest {
	public static void main(String[] args) {
		//new Director().constructProduct(new ConcreteBuilder());
		
		new Director().constructProduct1(new ConcreteBuilder());
	}
}
