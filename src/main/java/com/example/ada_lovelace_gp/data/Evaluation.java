package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="evaluation_id")
    private long id;
    private Date date_evaluation;
    private int evaluation;
    @ManyToOne
    @JoinColumn(name="fk_plan_evaluation_id")
    private PlanEntrainement planEntrainement;
}
