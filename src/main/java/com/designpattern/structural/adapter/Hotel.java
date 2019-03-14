package com.designpattern.structural.adapter;

/** 
 * �¹����� 
 */  
public class Hotel {  
  
    //�ù�����һ���±�Ĳ��  
    private DBSocketInterface dbSocket;  
      
    public Hotel(){}  
      
    public Hotel(DBSocketInterface dbSocket) {  
        this.dbSocket = dbSocket;  
    }  
  
    public void setSocket (DBSocketInterface dbSocket){  
        this.dbSocket = dbSocket;  
    }  
  
    //�ù�����һ�����Ĺ���  
    public void charge(){  
          
        //ʹ�õ±��ڳ�� 
    	// ������ģʽ�ؼ������������ģʽ�е�dbSocket�Ѿ���SoketAdapter��ʵ�������ˡ�
        dbSocket.powerWithTwoRound();  
    }  
}  

