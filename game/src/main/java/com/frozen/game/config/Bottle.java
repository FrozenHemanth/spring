package com.frozen.game.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Bottle {
    private Perfume perfume;
    private Paint paint;
    private Glue glue;

    public Bottle() {
        System.out.println("Bottle connected");

    }
    @Autowired
    public void setPerfume (Perfume perfume) {
                this.perfume = perfume;
        System.out.println("Perfume connected");
    }
    @Autowired
    public void setPaint(Paint paint) {
        this.paint = paint;
        System.out.println("Paint connected");
    }
    @Autowired
    public void setGlue(Glue glue) {
        this.glue = glue;
        System.out.println("Glue connected");
    }
}
