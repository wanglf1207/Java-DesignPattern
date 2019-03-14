package com.designpattern.creative.builder;

public class ConcreteBuilder implements Builder {

	private Product product;
	
	public ConcreteBuilder() {
		product = new Product();
	}
	
	@Override
	public void buildPart1() {
		product.setPart1("�����һ����");
		System.out.println("�����һ����");

	}

	@Override
	public void buildPart2() {
		product.setPart2("����ڶ�����");
		System.out.println("����ڶ�����");

	}

	@Override
	public void buildPart3() {
		product.setPart3("�����������");
		System.out.println("�����������");
	}

	@Override
	public Product buildProduct() {
		return product;
	}

}
