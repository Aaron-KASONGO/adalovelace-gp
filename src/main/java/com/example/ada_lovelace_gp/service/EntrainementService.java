package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.EntrainementRepository;
import org.springframework.stereotype.Service;

@Service
public class EntrainementService {
    private final EntrainementRepository entrainementRepository;

    public EntrainementService(EntrainementRepository entrainementRepository) {
        this.entrainementRepository = entrainementRepository;
    }

    public EntrainementRepository getEntrainementRepository() {
        return entrainementRepository;
    }
}
