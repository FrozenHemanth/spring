package com.frozen.service;

import com.frozen.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ProductServiceImpl implements ProductService {

public ProductServiceImpl() {
        System.out.println("ProductServiceImpl object created.");
}

    @Override
    public boolean validateandSave(ProductDTO productDTO ) {
        return true;
    }
}
