package com.designpattern.structural.adapter;
/**
 * 德国插座
 */
public class DBSocket implements DBSocketInterface{

    public void powerWithTwoRound(){
        System.out.println("使用两项圆头的插孔供电");
    }
}  
