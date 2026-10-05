package com.frozen.comp;

import com.frozen.dto.RegisterDTO;
import com.frozen.service.RegisterService;
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
public class RegisterComponent {
    @Autowired
    private RegisterService registerService;

    public RegisterComponent() {
        System.out.println("RegisterComponent created.");
    }

    @PostMapping("/register")
    public String register(@Valid RegisterDTO registerDTO,
                          BindingResult bindingResult,
                          Model model) {
        System.out.println("RegisterComponent register() method called.");
        System.out.println("registerDTO = " + registerDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("Validation errors found:");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("errors", errors);
            model.addAttribute("registerDTO", registerDTO);
        }
        else {
            System.out.println("Validation passed. Proceeding to save the registration.");
            registerService.validateandSave(registerDTO);
        }
        return "Register.jsp";
    }
    @GetMapping("/register")
    public String registerGet(@Valid RegisterDTO registerDTO,
                             BindingResult bindingResult,
                             Model model) {
        System.out.println("RegisterComponent register() method called for GET request.");
        return "Register.jsp";
    }

}

