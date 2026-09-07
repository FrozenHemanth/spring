package com.frozen.game.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@ComponentScan(basePackages = "com.frozen.game")
@Configuration
@EnableWebMvc
public class GameDataBaseConf {
    public GameDataBaseConf() {
        System.out.println("GameDataBaseConf connected");
    }
}
