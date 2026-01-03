package com.Amar.AgriConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.Amar.AgriConnect.model.Product;
import com.Amar.AgriConnect.model.User;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByFarmer(User farmer);
}
