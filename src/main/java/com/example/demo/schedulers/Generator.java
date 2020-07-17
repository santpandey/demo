package com.example.demo.schedulers;

import org.springframework.context.ApplicationEvent;

public class Generator extends ApplicationEvent {

    private int number;

    public Generator(Object source, int number) {
        super(source);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
