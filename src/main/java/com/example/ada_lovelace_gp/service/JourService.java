package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.JourRepository;
import org.springframework.stereotype.Service;

@Service
public class JourService {
    private final JourRepository jourRepository;

    public JourService(JourRepository jourRepository) {
        this.jourRepository = jourRepository;
    }

    public JourRepository getJourRepository() {
        return jourRepository;
    }
}
