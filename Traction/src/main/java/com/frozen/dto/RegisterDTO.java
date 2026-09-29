package com.frozen.dto;
import lombok.*;

@Data
public class RegisterDTO {
    private String firstname;
    private String lastname;
    private String email;
    private String watsno;


    public RegisterDTO() {
        System.out.println("RegisterDTO created.");
    }
}
