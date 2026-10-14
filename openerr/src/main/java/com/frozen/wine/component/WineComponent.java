package com.frozen.wine.component;

import com.frozen.wine.dto.WineDTO;
import com.frozen.wine.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
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
            System.out.println("Errors: " + errors);
          model.addAttribute("winemessage", wineDTO);
        }
        else {
            System.out.println("validation passed");
            boolean saved = wineService.saveAndValidate(wineDTO);
            System.out.println("Data saved: " + saved);
        }
        model.addAttribute("winemessage", wineDTO);
        return "wine.jsp";
    }
    @GetMapping("/opener")
    public String success(Model model) {
        System.out.println("wine() method called for GET request.");

        model.addAttribute("winemessage", new WineDTO());
        return "wine.jsp";
    }
    @GetMapping("/showAll")
        public String showAll(Model model) {
        System.out.println("showAll() method called for GET request.");
        List<WineDTO> wineDTOs = wineService.findAll();
        model.addAttribute("WineDTOsList",wineDTOs);
        return "winedisplay.jsp";
    }
    @GetMapping("/editwine")
    public String editWine(Model model, @RequestParam int id) {
        WineDTO wineDTO = wineService.findById(id);
        if (wineDTO != null) {
            model.addAttribute("winemessage", wineDTO);
        } else {
            model.addAttribute("error", "No wine found with id: " + id);
        }
        return "wine.jsp";
    }
    @PostMapping("/updatewine")
    public String updateWine(Model model, @Valid WineDTO wineDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("validation failed or has errors fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("errors", bindingResult.getAllErrors());
            System.out.println("Errors: " + errors);
            model.addAttribute("winemessage", wineDTO);
        } else {
            System.out.println("validation passed");
            boolean saved = wineService.saveAndValidate(wineDTO);
            System.out.println("Data saved: " + saved);
        }
        model.addAttribute("winemessage", wineDTO);
        return "wine.jsp";
    }
}

