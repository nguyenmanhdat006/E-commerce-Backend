package com.nguyendat.shopee_be.services;

import com.nguyendat.shopee_be.dto.ProductDto;
import com.nguyendat.shopee_be.entities.Product;
import com.nguyendat.shopee_be.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(ProductDto product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        // to-do mapping of product into productDto
        return products;
    }

    private Product createProducts(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setBrand(productDto.getBrand());
        product.setNewArrival(productDto.isNewArrival());
        return product;
    }
}
