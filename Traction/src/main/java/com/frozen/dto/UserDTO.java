package com.frozen.dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserDTO {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    public UserDTO() {
        System.out.println("UserDTO created.");
    }
}
