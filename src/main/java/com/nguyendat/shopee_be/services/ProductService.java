package com.nguyendat.shopee_be.services;

import com.nguyendat.shopee_be.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public Product addProduct(Product product);
    public List<Product> getAllProducts();
}
