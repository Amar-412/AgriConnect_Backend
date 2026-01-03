package com.Amar.AgriConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Amar.AgriConnect.model.FarmerProfile;
import com.Amar.AgriConnect.model.User;

public interface FarmerProfileRepository extends JpaRepository<FarmerProfile, Long> {

    FarmerProfile findByUser(User user);
}
