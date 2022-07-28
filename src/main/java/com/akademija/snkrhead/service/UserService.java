package com.akademija.snkrhead.service;

import com.akademija.snkrhead.entity.User;
import com.akademija.snkrhead.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
