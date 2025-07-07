package com.cognizant.springlearn;

public class HelloWorld {
    private String message;

    public HelloWorld() {
        System.out.println("HelloWorld constructor called");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
