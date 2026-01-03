package com.Amar.AgriConnect.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.Amar.AgriConnect.model.Product;
import com.Amar.AgriConnect.model.User;
import com.Amar.AgriConnect.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByFarmer(User farmer) {
        return productRepository.findByFarmer(farmer);
    }
}
