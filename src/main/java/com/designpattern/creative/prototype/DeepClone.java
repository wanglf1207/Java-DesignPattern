package com.designpattern.creative.prototype;

public class DeepClone implements  Cloneable{

	private int[] b; // 非基本类型

	// Object的clone方法只能复制基本数据类型
	@Override
	public Object clone() {
		DeepClone deepClone = null;
		try {
			deepClone = (DeepClone) super.clone();
			int[] t = deepClone.getB();
			int[] b1 = new int[t.length];
			for (int i = 0; i < b1.length; i++) {
				b1[i] = t[i];
			}
			deepClone.setB(b1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return deepClone;
	}



	public int[] getB() {
		return b;
	}

	public void setB(int[] b) {
		this.b = b;
	}

	public static void main(String  [] args) {
		DeepClone deepClone = new DeepClone();
		deepClone.setB(new int[]{1000});

		DeepClone deepCloneNew = (DeepClone)deepClone.clone();
		deepCloneNew.setB(new int[]{500});

		System.out.println(deepClone.getB()[0] + ":" +deepCloneNew.getB()[0]);
	}
}
