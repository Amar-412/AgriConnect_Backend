package com.Amar.AgriConnect.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.Amar.AgriConnect.model.Product;
import com.Amar.AgriConnect.model.User;
import com.Amar.AgriConnect.service.ProductService;
import com.Amar.AgriConnect.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;
    private final UserService userService;

    public ProductController(ProductService productService, UserService userService) {
        this.productService = productService;
        this.userService = userService;
    }

    // 🔹 GET all products (Buyer / Home page)
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // 🔹 POST product by farmer
    @PostMapping("/farmer/products/{farmerEmail}")
    public Product addProduct(
            @PathVariable String farmerEmail,
            @RequestBody Product product) {

        User farmer = userService.findByEmail(farmerEmail);
        product.setFarmer(farmer);

        return productService.addProduct(product);
    }
}
