package com.example.ada_lovelace_gp.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;
    private String nom;
    private String sub;
    @OneToMany(mappedBy = "user")
    private List<Objectif> objectifList;

    public User(String nom, String sub) {
        this.nom = nom;
        this.sub = sub;
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public List<Objectif> getObjectifList() {
        return objectifList;
    }

    public void setObjectifList(List<Objectif> objectifList) {
        this.objectifList = objectifList;
    }
}
