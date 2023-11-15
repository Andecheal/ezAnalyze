package com.ezana.common;

import org.springframework.http.HttpStatus;

/**
 * @version 0.0.1
 * @descreption: Uniform return encapsulation
 * @author: Andecheal
 * @date 2023/11/15 23:55
 **/
public class Response<T> {

    private int code;

    private String message;

    private T data;

    public int getCode() {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static Response<Object> ok(Object result){
        Response<Object> response = new Response<>();
        response.code = HttpStatus.OK.value();
        response.message = "ok";
        response.data = result;
        return response;
    }
}
