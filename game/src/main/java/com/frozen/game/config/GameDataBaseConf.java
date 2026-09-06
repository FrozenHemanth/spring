package com.frozen.game.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class GameDataBaseConf {
    public GameDataBaseConf() {
        System.out.println("GameDataBaseConf connected");
    }
}
