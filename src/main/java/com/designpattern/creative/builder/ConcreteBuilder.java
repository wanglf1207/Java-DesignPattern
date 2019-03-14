package com.designpattern.creative.builder;

public class ConcreteBuilder implements Builder {

	private Product product;
	
	public ConcreteBuilder() {
		product = new Product();
	}
	
	@Override
	public void buildPart1() {
		product.setPart1("建造第一部分");
		System.out.println("建造第一部分");

	}

	@Override
	public void buildPart2() {
		product.setPart2("建造第二部分");
		System.out.println("建造第二部分");

	}

	@Override
	public void buildPart3() {
		product.setPart3("建造第三部分");
		System.out.println("建造第三部分");
	}

	@Override
	public Product buildProduct() {
		return product;
	}

}
