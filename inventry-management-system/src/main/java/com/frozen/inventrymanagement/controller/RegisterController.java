package com.frozen.inventrymanagement.controller;

@Controller
@RequestMapping("/")
public class RegisterController {

    public RegisterController(){
        System.out.println("The RegisterController is created");
    }

    @GetMapping("Register")
    public String openRegister(){
        return "Register";
    }

    @PostMapping("register")
    public String register(Model model, @Valid RegisterDTO registerDTO, BindingResult bindingResult){
        System.out.println("The ");
        return "Register";
    }
}
