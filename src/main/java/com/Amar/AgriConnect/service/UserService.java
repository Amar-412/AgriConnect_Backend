package com.Amar.AgriConnect.service;

import org.springframework.stereotype.Service;
import com.Amar.AgriConnect.repository.UserRepository;
import com.Amar.AgriConnect.model.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
