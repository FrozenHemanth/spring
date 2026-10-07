package com.frozen.component;

import com.frozen.dto.WineDTO;
import com.frozen.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class WineComponent {
    @Autowired
    private WineService wineService;
    public WineComponent() {
        System.out.println("WineComponent created.");

    }

    @PostMapping("/wine")
    public String opener(Model model, @Valid WineDTO wineDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("validation failed or has errors fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("errors", bindingResult.getAllErrors());
          model.addAttribute("winemessage", wineDTO);
        }
        else {
            System.out.println("validation passed");
            System.out.println();
        }
        model.addAttribute("winemessage", wineDTO);
        model.addAttribute("bindingResult", bindingResult);
        return "wine.jsp";
    }
    @GetMapping("/opener")
    public String success(Model model) {
        System.out.println("wine() method called for GET request.");

        model.addAttribute("winemessage", new WineDTO());
        return "wine.jsp";
    }
}

