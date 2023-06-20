package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commentaire_id")
    private long id;
    private Date date_comment;
    private String contenu;
    @ManyToOne
    @JoinColumn(name="fk_plan_commentaire_id")
    private PlanEntrainement planEntrainement;
}
