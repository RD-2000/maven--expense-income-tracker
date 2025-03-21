package com.rd.service;



import com.rd.model.User;
import com.rd.repository.UserRepository;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void registerUser(String username, String password) {
        userRepository.save(new User(username, password));
    }

    public User loginUser(String username, String password) {
        return userRepository.findByUsername(username)
                .filter(u -> u.password().equals(password))
                .orElse(null);
    }
}

