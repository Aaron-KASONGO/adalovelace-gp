package com.example.ada_lovelace_gp.repository;

import com.example.ada_lovelace_gp.data.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface UserRepository extends CrudRepository<User, Long> {
    public Collection<User> findBySub(String sub);
}
