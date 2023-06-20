package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.ChampRepository;
import org.springframework.stereotype.Service;

@Service
public class ChampService {
    private final ChampRepository champRepository;

    public ChampService(ChampRepository champRepository) {
        this.champRepository = champRepository;
    }

    public ChampRepository getChampRepository() {
        return champRepository;
    }
}
