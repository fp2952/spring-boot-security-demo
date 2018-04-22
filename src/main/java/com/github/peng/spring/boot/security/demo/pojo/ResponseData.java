package com.github.peng.spring.boot.security.demo.pojo;

/**
 * Created by fp295 on 2018/4/22.
 */
public class ResponseData <T>{

    //成功
    public final static int SUCCESS = 0;

    //失败
    public final static int ERROR = -1;

    private Integer code;

    private String message;

    private T data;

    public ResponseData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
