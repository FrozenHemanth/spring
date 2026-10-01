package com.frozen.comp;

import com.frozen.dto.RegisterDTO;
import com.frozen.service.RegisterService;
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
public class RegisterComponent {
    @Autowired
    private RegisterService registerService;

    public RegisterComponent() {
        System.out.println("RegisterComponent created.");
    }

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public String register(@ModelAttribute("registerDTO") @Valid RegisterDTO registerDTO,
                           BindingResult bindingResult,
                           Model model) {
        System.out.println("RegisterComponent register() method called.");
        System.out.println("registerDTO = " + registerDTO);

        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(error ->
                    System.out.println("Validation error: " + error.getDefaultMessage()));
            model.addAttribute("registerMessage", "Invalid register data");
            return "Register.jsp";
        }

        registerService.validateandSave(registerDTO);
        model.addAttribute("registerMessage", "Register successful");
        return "Register.jsp";
    }
}
