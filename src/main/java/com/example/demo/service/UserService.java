package com.example.demo.service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(Long id, User updatedUser) {
        User user = getById(id);

        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());

        return repository.save(user);
    }

    public void delete(Long id) {
        User user = getById(id);
        repository.delete(user);
    }
}