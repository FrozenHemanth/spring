package com.frozen.comp;

import com.frozen.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class ProductComponent {
    public ProductComponent() {
        System.out.println("ProductComponent created.");
    }
    @RequestMapping("/product")
    public String product(Model model , ProductDTO productDTO) {
        model.addAttribute("productMessage" , "Product registered successfully " + productDTO);
        return "Product.jsp";
    }
}
