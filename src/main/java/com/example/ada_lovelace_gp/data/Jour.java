package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

@Entity
public class Jour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="jour_id")
    private long id;
    private byte jour;
    @ManyToOne
    @JoinColumn(name="fk_temps_jour_id")
    private Temps temps;
}
