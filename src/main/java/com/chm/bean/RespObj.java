package com.chm.bean;

/**
 * 响应类
 */
public class RespObj {

    private boolean flag;
    private String message;

    /* constructor */
    public RespObj(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public static RespObj success(String msg) {
        return new RespObj(true, msg);
    }

    public static RespObj error(String msg) {
        return new RespObj(false, msg);
    }

    /* getter and setter */
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RespObj{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                '}';
    }
}
