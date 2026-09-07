package com.frozen.game.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.frozen.game")

public class GamePrimaryConfig {
    public GamePrimaryConfig() {
        System.out.println("GamePrimaryConfig connected");
    }
}
