package com.nguyendat.shopee_be.services;

import com.nguyendat.shopee_be.entities.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public List<Product> getAllProducts();
}
