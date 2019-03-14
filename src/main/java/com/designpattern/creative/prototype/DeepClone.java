package com.designpattern.creative.prototype;

public class DeepClone {
	
	private int a; // ��������
	private int[] b; // �ǻ�������
	
	// Object��clone����ֻ�ܸ��ƻ�����������
	@Override
	public Object clone() {
		DeepClone sc = null;
		try {
			sc = (DeepClone) super.clone();
			int[] t = sc.getB();
			int[] b1 = new int[t.length];
			for (int i = 0; i < b1.length; i++) {
				b1[i] = t[i];
			}
			sc.setB(b1);
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
}
