package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.ActiviryRepository;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    private final ActiviryRepository activiryRepository;

    public ActivityService (ActiviryRepository activiryRepository) {
        this.activiryRepository = activiryRepository;
    }

    public ActiviryRepository getActiviryRepository() {
        return activiryRepository;
    }
}
