package com.nguyendat.shopee_be.controllers;

import com.nguyendat.shopee_be.dto.ProductDto;
import com.nguyendat.shopee_be.services.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nguyendat.shopee_be.entities.Product;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> productLíst = productService.getAllProducts();
        return new ResponseEntity<>(productLíst, HttpStatus.OK) ;
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto product) {
        return null;

    }
}
