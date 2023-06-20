package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class PlanEntrainement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "plan_entrainement_id")
    private long id;
    private int jour;
    private int tempsRepos;
    @OneToMany(mappedBy = "planEntrainement")
    private List<Commentaire> commentaireList;
    @OneToMany(mappedBy = "planEntrainement")
    private List<Evaluation> evaluationList;
    @OneToMany(mappedBy = "planEntrainement")
    private List<Temps> tempsList;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="fk_entrainement_objectif_id")
    private Objectif objectif;
}
