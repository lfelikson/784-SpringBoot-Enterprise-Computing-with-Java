package com.mycompany.httpapimydemo.web;

public class MyOutputResource {

    private String responseMessage;

    public MyOutputResource(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

}