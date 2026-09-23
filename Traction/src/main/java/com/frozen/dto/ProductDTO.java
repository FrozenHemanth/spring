package com.frozen.dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ProductDTO {
    private String name;
    private String price;
    private String description;

    public ProductDTO() {
        System.out.println("ProductDTO created.");
    }
}
