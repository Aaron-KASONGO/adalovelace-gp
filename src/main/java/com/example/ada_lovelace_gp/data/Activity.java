package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "activiry_id")
    private long id;
    private String typeActivity;
    private double duree;
    private double caloriesBrule;

    @ManyToOne
    @JoinColumn(name="fk_activity_user_id")
    private User user;
    @OneToMany(mappedBy = "activity")
    private List<Champ> champList;

    @OneToOne(mappedBy = "activity")
    private Temps temps;
}
