package com.Amar.AgriConnect.service;

import org.springframework.stereotype.Service;
import com.Amar.AgriConnect.repository.FarmerProfileRepository;
import com.Amar.AgriConnect.model.FarmerProfile;
import com.Amar.AgriConnect.model.User;

@Service
public class FarmerProfileService {

    private final FarmerProfileRepository farmerProfileRepository;

    public FarmerProfileService(FarmerProfileRepository farmerProfileRepository) {
        this.farmerProfileRepository = farmerProfileRepository;
    }

    public FarmerProfile saveProfile(FarmerProfile profile) {
        return farmerProfileRepository.save(profile);
    }

    public FarmerProfile getByUser(User user) {
        return farmerProfileRepository.findByUser(user);
    }
}
