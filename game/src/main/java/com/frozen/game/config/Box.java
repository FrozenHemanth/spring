package com.frozen.game.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {
    private Bottle bottle;


    public Box(){

        System.out.println("Box Connected");

    }
    @Autowired
    public void setBottle(Bottle bottle){
        this.bottle = bottle;
        System.out.println("Bottle connected");
    }
}
