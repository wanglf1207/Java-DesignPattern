package com.designpattern.structural.proxy.v2;
//�����࣬ģ��Tank��Ŀͻ���
public class Client {
	public static void main(String[] args) {
		IMoveable m = new Tank2();
		m.move();
	}
}