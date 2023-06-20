package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.RetardRepository;
import org.springframework.stereotype.Service;

@Service
public class RetardService {
    private final RetardRepository retardRepository;

    public RetardService(RetardRepository retardRepository) {
        this.retardRepository = retardRepository;
    }

    public RetardRepository getRetardRepository() {
        return retardRepository;
    }
}
