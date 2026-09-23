package com.frozen.comp;

import com.frozen.dto.RegisterDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class RegisterComponent {

public RegisterComponent(){
    System.out.println("RegisterComponent created.");
}
    @RequestMapping("/register")
    public String register(Model model ,RegisterDTO registerDTO) {
        model.addAttribute("registerMessage" , "Registration successful");
        return "Register.jsp";

    }
}
