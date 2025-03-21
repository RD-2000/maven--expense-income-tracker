package com.rd.repository;



import com.rd.model.User;

import java.util.HashMap;
import java.util.Optional;

public class UserRepository {
    private final HashMap<String, User> users = new HashMap<>();

    public void save(User user) { users.put(user.username(), user); }
    public Optional<User> findByUsername(String username) { return Optional.ofNullable(users.get(username)); }
}


