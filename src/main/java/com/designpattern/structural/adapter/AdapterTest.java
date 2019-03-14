package com.designpattern.structural.adapter;

public class AdapterTest {
	
	public static void main(String[] args) {  
        
        GBSocketInterface gbSocket = new GBSocket();  
        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);  
          
        Hotel hotel = new Hotel();  
        hotel.setSocket(socketAdapter);  
        hotel.charge();  
    }  
}
