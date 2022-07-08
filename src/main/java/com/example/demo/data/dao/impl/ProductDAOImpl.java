package com.example.demo.data.dao.impl;

import com.example.demo.data.dao.ProductDAO;
import com.example.demo.data.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public Product getProduct(String productId) {
        Product productEntity = productRepository.getReferenceById(productId);
        return productEntity;
    }
}
