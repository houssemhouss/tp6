package com.houssem.joueurs.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Joueur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idJoueur;
private String nomJoueur;
private Double prixJoueur;
private Date dateCreation;
@ManyToOne
private Equipe equipe;
public Joueur() {
super();
}
public Joueur(String nomJoueur, Double prixJoueur, Date dateCreation) {
super();
this.nomJoueur = nomJoueur;
this.prixJoueur = prixJoueur;
this.dateCreation = dateCreation;
}
public Long getIdJoueur() {
	return idJoueur;
}
public void setIdJoueur(Long idJoueur) {
	this.idJoueur = idJoueur;
}
public String getNomJoueur() {
	return nomJoueur;
}
public void setNomJoueur(String nomJoueur) {
	this.nomJoueur = nomJoueur;
}
public Double getPrixJoueur() {
	return prixJoueur;
}
public void setPrixJoueur(Double prixJoueur) {
	this.prixJoueur = prixJoueur;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public Equipe getEquipe() {
	return equipe;
}
public void setEquipe(Equipe equipe) {
	this.equipe = equipe;
}

	}
