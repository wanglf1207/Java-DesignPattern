package com.designpattern.behavioral.chainofresp;

public class Test {  
 
   public static void main(String[] args) {  
	   
	   SimpleHandler sh1 = new SimpleHandler("h1");  
	   SimpleHandler sh2 = new SimpleHandler("h2");  
	   SimpleHandler sh3 = new SimpleHandler("h3");  
 
       sh1.setHandler(sh2);  
       sh2.setHandler(sh3);  
  
       sh1.operator();  
    }  
}  
