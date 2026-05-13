package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();
    private Long idCounter = 1L;

    public List<User> getAll() {
        return users;
    }

    public User getById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User create(User user) {
        user.setId(idCounter++);
        users.add(user);
        return user;
    }

    public User update(Long id, User newUser) {
        User user = getById(id);
        if (user != null) {
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
        }
        return user;
    }

    public boolean delete(Long id) {
        return users.removeIf(u -> u.getId().equals(id));
    }
}