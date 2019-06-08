package com.designpattern.creative.builder;

public class ConcreteBuilder implements Builder {

	private Product product;
	
	public ConcreteBuilder() {
		product = new Product();
	}
	
	@Override
	public Product buildPart1() {
		product.setPart1("创建part1");
		System.out.println("创建part1");
		return product;

	}

	@Override
	public Product buildPart2() {
		product.setPart2("创建part2");
		System.out.println("创建part2");
		return  product;

	}

	@Override
	public Product buildPart3() {
		product.setPart3("创建part3");
		System.out.println("创建part3");
		return product;
	}

	@Override
	public Product buildProduct() {
		return product;
	}

}
