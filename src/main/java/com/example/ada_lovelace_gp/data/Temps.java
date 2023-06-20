package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Temps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="temps_id")
    private long id;
    private Date date;
    private Date dateDebut;
    private Date dateFin;
    private Boolean valide;
    @ManyToOne
    @JoinColumn(name="fk_plan_temps_id")
    private PlanEntrainement planEntrainement;
    @OneToMany(mappedBy = "temps")
    private List<Jour> jours;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="fk_temps_activity_id")
    private Activity activity;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="fk_temps_retard_id")
    private Retard retard;
}
