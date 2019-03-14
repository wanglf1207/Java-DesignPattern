package com.designpattern.behavioral.chainofresp.v1;

public class Main {
    public static void main(String [] args) {
        String msg = "<script>,:),被就业";
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);
        String str = mp.process();
        System.out.println(str);
    }
}
