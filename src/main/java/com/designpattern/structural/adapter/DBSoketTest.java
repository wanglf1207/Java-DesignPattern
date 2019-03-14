package com.designpattern.structural.adapter;

public class DBSoketTest {  
	  
    public static void main(String[] args) {  
          
        //��ʼ��һ���¹��������� ��һ���±�ӿ�������  
        DBSocketInterface dbSoket = new DBSocket();  
          
        //����һ���ùݶ���  
        Hotel hotel = new Hotel(dbSoket);  
          
        //���ù��и��ֻ����  
        hotel.charge();  
    }  
}  
