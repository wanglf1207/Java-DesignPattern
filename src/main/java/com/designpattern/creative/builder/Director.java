package com.designpattern.creative.builder;

public class Director {

	public Product constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildPart1();
        concreteBuilder.buildPart2();
        concreteBuilder.buildPart3();
        return concreteBuilder.buildProduct();
    }
	
	public Product constructProduct1(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildPart1();
        concreteBuilder.buildPart3();
        return concreteBuilder.buildProduct();
    }
	
	
}
