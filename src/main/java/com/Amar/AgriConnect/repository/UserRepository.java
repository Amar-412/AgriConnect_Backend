package com.Amar.AgriConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Amar.AgriConnect.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
