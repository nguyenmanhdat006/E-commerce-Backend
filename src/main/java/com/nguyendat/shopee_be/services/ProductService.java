package com.nguyendat.shopee_be.services;

import com.nguyendat.shopee_be.dto.ProductDto;
import com.nguyendat.shopee_be.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public Product addProduct(ProductDto product);
    public List<Product> getAllProducts();
}
