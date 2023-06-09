package com.example.facturaux.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Client {
    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "nom")
    private String nom;

    @ColumnInfo(name = "prenom")
    private String prenom;

    @ColumnInfo(name = "numeroDeRue")
    private int numeroDeRue;

    @ColumnInfo(name = "numeroExtension")
    private String numeroExtension;

    @ColumnInfo(name = "nomDeRue")
    private String nomDeRue;

    @ColumnInfo(name = "codePostal")
    private int codePostal;

    @ColumnInfo(name = "nomDeLaCommune")
    private String nomDeLaCommune;

    @ColumnInfo(name = "adresseMail")
    private String adresseMail;

    @ColumnInfo(name = "telephone1")
    private int telephone1;

    @ColumnInfo(name = "telephone2")
    private int telephone2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroDeRue() {
        return numeroDeRue;
    }

    public void setNumeroDeRue(int numeroDeRue) {
        this.numeroDeRue = numeroDeRue;
    }

    public String getNumeroExtension() {
        return numeroExtension;
    }

    public void setNumeroExtension(String numeroExtension) {
        this.numeroExtension = numeroExtension;
    }

    public String getNomDeRue() {
        return nomDeRue;
    }

    public void setNomDeRue(String nomDeRue) {
        this.nomDeRue = nomDeRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomDeLaCommune() {
        return nomDeLaCommune;
    }

    public void setNomDeLaCommune(String nomDeLaCommune) {
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public int getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(int telephone) {
        this.telephone1 = telephone;
    }

    public int getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(int telephone2) {
        this.telephone2 = telephone2;
    }
}
