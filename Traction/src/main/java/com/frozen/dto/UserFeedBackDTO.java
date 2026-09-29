package com.frozen.dto;
import lombok.*;
@Data
public class UserFeedBackDTO {
    private String name;
    private String feedback;
    private String rating;

    public UserFeedBackDTO() {
        System.out.println("UserFeedBackDTO created.");
    }

}
