package com.example.ada_lovelace_gp.service;

import com.example.ada_lovelace_gp.repository.EvaluationRepository;
import org.springframework.stereotype.Service;

@Service
public class EvaluationService {
    private final EvaluationRepository evaluationRepository;

    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public EvaluationRepository getEvaluationRepository() {
        return evaluationRepository;
    }
}
