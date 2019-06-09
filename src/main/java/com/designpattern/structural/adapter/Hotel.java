package com.designpattern.structural.adapter;

/**
 * 德国宾馆
 */
public class Hotel {

    //旅馆中有一个德标的插口
    private DBSocketInterface dbSocket;

    public Hotel(){}

    public Hotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void setSocket (DBSocketInterface dbSocket){
        this.dbSocket = dbSocket;
    }

    //旅馆中有一个充电的功能
    public void charge(){

        //使用德标插口充电
        // 适配器模式关键在这里，适配器模式中的dbSocket已经是SoketAdapter的实例对象了。
        dbSocket.powerWithTwoRound();
    }
}  

