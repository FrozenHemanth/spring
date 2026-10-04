package com.frozen.comp;

import com.frozen.dto.UserDTO;
import com.frozen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserComponent {
    @Autowired
    private UserService userService;

    public UserComponent() {
        System.out.println("UserComponent created.");
    }

    @PostMapping("/user")
    public String user(@Valid UserDTO userDTO,
                       BindingResult bindingResult,
                       Model model) {
        System.out.println("UserComponent user() method called.");
        System.out.println("userDTO = " + userDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("Validation errors found:");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("errors", errors);
            model.addAttribute("userMessage", userDTO);
        }
        else {
            System.out.println("Validation passed. Proceeding to save the user.");
        }
        return "user.jsp";
    }
    @GetMapping("/user")
    public String userGet() {
        System.out.println("UserComponent user() method called for GET request.");
        System.out.println("Returning user.jsp view.");


        return "user.jsp";
    }

}
