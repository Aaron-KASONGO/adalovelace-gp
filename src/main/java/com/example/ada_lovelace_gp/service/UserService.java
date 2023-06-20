package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.data.User;
import com.example.ada_lovelace_gp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        this.userRepository.save(user);
    }

    public void deleteUser(User user) {
        this.userRepository.delete(user);
    }

    public User findById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    public Collection<User> findBySub(String sub) {
        return this.userRepository.findBySub(sub);
    }

    public Collection<User> getAll() {
        return (Collection<User>) this.userRepository.findAll();
    }
}
