package com.designpattern.structural.adapter;

public class SocketAdapter implements DBSocketInterface { // ʵ�־ɽӿ�

	// ����½ӿ�
	private GBSocketInterface gbSocket;

	/**
	 * �ڴ�������������ʱ�����봫��һ���½ֿڵ�ʵ����
	 * 
	 * @param gbSocket
	 */
	public SocketAdapter(GBSocketInterface gbSocket) {
		this.gbSocket = gbSocket;
	}

	/**
	 * ���Ծͽӿڵĵ������䵽�½ӿ�
	 */
	@Override
	public void powerWithTwoRound() {

		gbSocket.powerWithThreeFlat();
	}

}
