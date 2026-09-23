package com.frozen.comp;

import com.frozen.dto.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class UserComponent {

    public UserComponent() {
        System.out.println("UserComponent created.");
    }
    @RequestMapping("/user")
    public String onClick(Model model , UserDTO userDTO) {
        model.addAttribute("userMessage" , "User registered successfully " + userDTO);
        return "user.jsp";
    }
}
