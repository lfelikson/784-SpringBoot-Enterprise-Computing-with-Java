package com.example.myfirstapp.bean;

public class Notification {

    private final String msg;
    private final String dest;

    public Notification(String msg, String dest) {
        this.msg  = msg;
        this.dest = dest;
    }

    @Override
    public String toString() {
        return String.format("Message is %s", msg, " ... Destination is %s", dest);
    }

}
