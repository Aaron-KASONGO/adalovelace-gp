package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.PlanEntrainementRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanEntrainementService {
    private final PlanEntrainementRepository planEntrainementRepository;

    public PlanEntrainementService(PlanEntrainementRepository planEntrainementRepository) {
        this.planEntrainementRepository = planEntrainementRepository;
    }

    public PlanEntrainementRepository getPlanEntrainementRepository() {
        return planEntrainementRepository;
    }
}
