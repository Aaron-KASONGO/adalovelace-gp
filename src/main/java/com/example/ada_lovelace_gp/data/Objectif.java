package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Objectif {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "objectif_id")
    private long id;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private String statut;

    @ManyToOne
    @JoinColumn(name="fk_objectif_user_id")
    private User user;

    @OneToOne(mappedBy = "objectif")
    private PlanEntrainement planEntrainement;
}
