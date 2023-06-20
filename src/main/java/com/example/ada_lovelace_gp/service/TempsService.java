package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.TempsRepository;
import org.springframework.stereotype.Service;

@Service
public class TempsService {
    private final TempsRepository tempsRepository;

    public TempsService(TempsRepository tempsRepository) {
        this.tempsRepository = tempsRepository;
    }

    public TempsRepository getTempsRepository() {
        return tempsRepository;
    }
}
