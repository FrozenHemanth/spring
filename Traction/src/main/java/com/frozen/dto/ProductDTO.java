package com.frozen.dto;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor

public class ProductDTO {
    @NotNull@Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String firstname;
    @NotNull
    @Min(value = 1, message = "Price must be greater than 0"   )
    @Max(value = 1000000, message = "Price must be less than 1000000")
    private Double price;
    @NotNull
    @Size(min = 3, max = 200, message = "Description must be between 3 and 200 characters")
    private String description;

    public ProductDTO() {
        System.out.println("ProductDTO created.");
    }
}
