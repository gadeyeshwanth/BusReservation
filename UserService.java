package com.busreservation.services;

import com.busreservation.models.User;
import com.busreservation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String username) {
        return userRepository.findByUsername(username);
    }
}
