package com.frozen.service;

import com.frozen.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

public ProductServiceImpl() {
        System.out.println("ProductServiceImpl object created.");
}

    @Override
    public Boolean validateandSave( ) {
        return null;
    }
}
