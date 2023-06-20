package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

@Entity
public class Champ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "champ_id")
    private long id;
    private String titre;
    private String contenu;
    @ManyToOne
    @JoinColumn(name="fk_activity_champ_id")
    private Activity activity;
}
