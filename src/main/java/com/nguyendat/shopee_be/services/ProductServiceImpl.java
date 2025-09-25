package com.nguyendat.shopee_be.services;

import com.nguyendat.shopee_be.entities.Product;
import com.nguyendat.shopee_be.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }
}
