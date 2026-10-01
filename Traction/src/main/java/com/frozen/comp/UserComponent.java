package com.frozen.comp;

import com.frozen.dto.UserDTO;
import com.frozen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class UserComponent {
    @Autowired
    private UserService userService;

    public UserComponent() {
        System.out.println("UserComponent created.");
    }

    @RequestMapping(value = "/user", method = {RequestMethod.GET, RequestMethod.POST})
    public String onClick(@ModelAttribute("userDTO") @Valid UserDTO userDTO,
                          BindingResult bindingResult,
                          Model model) {
        System.out.println("UserComponent onClick() method called.");
        System.out.println("userDTO = " + userDTO);

        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(error ->
                    System.out.println("Validation error: " + error.getDefaultMessage()));
            model.addAttribute("userMessage", "Invalid user data");
            return "user.jsp";
        }

        model.addAttribute("userMessage", "User registered successfully " + userDTO);
        userService.validateandSave();
        return "user.jsp";
    }
}
