package com.frozen.dto;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Validated
public class RegisterDTO {
    @NotNull
    @Size(min = 3, max = 20, message = "First name must be between 3 and 20 characters")
    private String firstname;
    @NotNull
    @Size(min = 3, max = 20, message = "Last name must be between 3 and 20 characters")
    private String lastname;
    @NotNull
    @Email(message = "Invalid email")
    private String email;
    @NotNull
    @Size(min = 2, max = 10, message = "What's your SNO must be between 2 and 10 characters")
    private String watsno;



    public RegisterDTO() {
        System.out.println("RegisterDTO created.");
    }
}
