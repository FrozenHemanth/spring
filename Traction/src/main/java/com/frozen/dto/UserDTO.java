package com.frozen.dto;
import lombok.*;

@Data
public class UserDTO {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    public UserDTO() {
        System.out.println("UserDTO created.");
    }
}
