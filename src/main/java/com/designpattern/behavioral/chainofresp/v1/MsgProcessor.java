package com.designpattern.behavioral.chainofresp.v1;

/**
 * @author wlf
 * 处理字符串的类
 */
public class MsgProcessor {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return
     */
    public String process() {
        String result = msg.replace('<', '[')
                .replace('>', ']')
                .replace("被就业", "就业")
                .replace(":)", "^_^");

        return result;
    }

}

