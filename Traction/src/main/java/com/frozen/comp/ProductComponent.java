package com.frozen.comp;

import com.frozen.dto.ProductDTO;
import com.frozen.service.ProductService;
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
public class ProductComponent {
    @Autowired
    private ProductService productService;

    public ProductComponent() {
        System.out.println("ProductComponent created.");
    }

    @PostMapping("/product")
    public String product(@Valid ProductDTO productDTO,
                          BindingResult bindingResult,
                          Model model) {
        System.out.println("ProductComponent product() method called.");
        System.out.println("productDTO = " + productDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("Validation errors found:");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("errors", errors);
            model.addAttribute("productMessage", productDTO);
        }
        else {
            System.out.println("Validation passed. Proceeding to save the product.");
        }
        return "Product.jsp";
    }
    @GetMapping("/product")
    public String productGet(@Valid ProductDTO productDTO,
                             BindingResult bindingResult,
                             Model model) {
        System.out.println("ProductComponent product() method called for GET request.");
//        List<ObjectError> errors = bindingResult.getAllErrors();
//        model.addAttribute("errors", errors);
//        model.addAttribute("productMessage", productDTO);
        return "Product.jsp";
    }

}
