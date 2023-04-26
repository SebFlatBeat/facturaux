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
    private Long telephone1;

    @ColumnInfo(name = "telephone2")
    private Long telephone2;

    public Client(String nom, String prenom, int numeroDeRue, String numeroExtension, String nomDeRue, int codePostal, String nomDeLaCommune, String adresseMail, Long telephone1, Long telephone2) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeRue = numeroDeRue;
        this.numeroExtension = numeroExtension;
        this.nomDeRue = nomDeRue;
        this.codePostal = codePostal;
        this.nomDeLaCommune = nomDeLaCommune;
        this.adresseMail = adresseMail;
        this.telephone1 = telephone1;
        this.telephone2 = telephone2;
    }


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

    public Long getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(Long telephone) {
        this.telephone1 = telephone;
    }

    public Long getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(Long telephone2) {
        this.telephone2 = telephone2;
    }
}