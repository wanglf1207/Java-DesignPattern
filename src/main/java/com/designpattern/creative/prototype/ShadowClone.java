package com.designpattern.creative.prototype;

public class ShadowClone implements Cloneable {

	private int a; // 基本类型
	private int[] b; // 非基本类型

	@Override
	public Object clone() {
		ShadowClone sc = null;
		try {
			sc = (ShadowClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sc;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int[] getB() {
		return b;
	}

	public void setB(int[] b) {
		this.b = b;
	}

	public static void main(String[] args) {

		ShadowClone c1 = new ShadowClone();
		//对c1赋值
		c1.setA(100) ;
		c1.setB(new int[]{1000}) ;

		System.out.println("克隆前c1:  a="+c1.getA()+" b="+c1.getB()[0]);
		//克隆出对象c2,并对c2的属性A,B,C进行修改
		ShadowClone c2 = (ShadowClone) c1.clone();
		//对c2进行修改  ,c1的非基本类型也被修改了
		c2.setA(50) ;
		int []a = c2.getB() ;
		a[0]=5 ;
		c2.setB(a);
		System.out.println("克隆后c1:  a="+c1.getA()+" b="+c1.getB()[0]);
		System.out.println("克隆后c2:  a="+c2.getA()+ " b[0]="+c2.getB()[0]);
	}

}
