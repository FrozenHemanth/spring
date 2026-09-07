package com.frozen.game.config;

import org.springframework.stereotype.Component;

@Component
public class Container {

    private Glass glass;
    public Container() {
        System.out.println("Container connected");
    }
    public void setGlass(Glass glass){
        this.glass = glass;
        System.out.println("Glass connected");
    }
}
