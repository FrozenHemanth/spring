package com.frozen.comp;

import com.frozen.dto.ProductDTO;
import com.frozen.service.ProductService;
import com.frozen.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class ProductComponent {
    @Autowired
    private ProductService productService;
    public ProductComponent() {
        System.out.println("ProductComponent created.");
    }
    @RequestMapping("/product")
    public String product(@Valid Model model , ProductDTO productDTO, BindingResult bindingResult) {
        System.out.println("ProductComponent product() method called.");
        System.out.println("productDTO ="+productDTO);
        productService.validateandSave(productDTO);
        return "Product.jsp";
    }
}
