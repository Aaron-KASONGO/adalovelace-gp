package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.ObjectifRepository;
import org.springframework.stereotype.Service;

@Service
public class ObjectifService {
    private final ObjectifRepository objectifRepository;

    public ObjectifService(ObjectifRepository objectifRepository) {
        this.objectifRepository = objectifRepository;
    }

    public ObjectifRepository getObjectifRepository() {
        return objectifRepository;
    }
}
