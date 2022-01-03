package com.houssem.joueurs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssem.joueurs.entities.Equipe;
import com.houssem.joueurs.entities.Joueur;
import com.houssem.joueurs.repos.JoueurRepository;

@Service
public class JoueurServiceImpl  implements JoueurService{
	@Autowired
	JoueurRepository JoueurRepository;
	
	@Override
	public List<Joueur> findByNomJoueur(String nom) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByNomJoueurContains(nom);
	}

	@Override
	public List<Joueur> findByNomJoueurContains(String nom) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByNomJoueurContains(nom);
	}

	@Override
	public List<Joueur> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByNomPrix(nom, 2000.0);
	}

	@Override
	public List<Joueur> findByEquipe(Equipe equipe) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByEquipe(equipe);
	}

	@Override
	public List<Joueur> findByEquipeIdM(Long id) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByEquipeIdM(id);
	}

	@Override
	public List<Joueur> findByOrderByNomJoueurAsc() {
		// TODO Auto-generated method stub
		return JoueurRepository.findByOrderByNomJoueurAsc();
	}

	@Override
	public List<Joueur> trierJoueursNomsPrix() {
		// TODO Auto-generated method stub
		return JoueurRepository.trierJoueursNomsPrix();
	}

	
	@Override
	public Joueur saveJoueur(Joueur vh) {
		// TODO Auto-generated method stub
		return JoueurRepository.save(vh);
	}

	@Override
	public Joueur updateJoueur(Joueur vh) {
	
		return JoueurRepository.save(vh);
	}
	@Override
	public void deleteJoueur(Joueur vh) {
	
		JoueurRepository.delete(vh);
	}
	 @Override
	public void deleteJoueurById(Long id) {
	
		 JoueurRepository.deleteById(id);
	}
	@Override
	public Joueur getJoueur(Long id) {
	
		return JoueurRepository.findById(id).get();
	}
	@Override
	public List<Joueur> getAllJoueurs() {
	
		return JoueurRepository.findAll();
	}

}
