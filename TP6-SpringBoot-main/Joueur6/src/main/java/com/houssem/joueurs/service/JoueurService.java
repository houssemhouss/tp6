package com.houssem.joueurs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.houssem.joueurs.entities.Equipe;
import com.houssem.joueurs.entities.Joueur;


public interface JoueurService {
	Joueur saveJoueur(Joueur jo);
	Joueur updateJoueur(Joueur jo);
	void deleteJoueur(Joueur jo);
	 void deleteJoueurById(Long id);
	 Joueur getJoueur(Long id);
	List<Joueur> getAllJoueurs();
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	List<Joueur> findByNomPrix (String nom, Double prix);
	List<Joueur> findByEquipe (Equipe categorie);
	List<Joueur> findByEquipeIdM(Long id);
	List<Joueur> findByOrderByNomJoueurAsc();
	List<Joueur> trierJoueursNomsPrix();

}
