package com.designpattern.structural.proxy.v1;
/**
 * �����࣬ģ��Tank��Ŀͻ���
 * @author wanglf1207
 */
public class Client {
	public static void main(String[] args) {
		IMoveable m = new Tank();
		m.move();
	}
}
