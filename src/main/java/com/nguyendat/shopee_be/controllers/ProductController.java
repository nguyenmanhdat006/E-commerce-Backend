package com.nguyendat.shopee_be.controllers;

import com.nguyendat.shopee_be.dto.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List<ProductDto> getProducts() {
        return Collections.emptyList();
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto product) {
        return null;

    }
}
