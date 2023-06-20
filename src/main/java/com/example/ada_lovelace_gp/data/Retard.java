package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

@Entity
public class Retard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "retard_id")
    private long id;
    @ManyToOne
    @JoinColumn(name="fk_temps_retard_id")
    private Temps temps;
}
