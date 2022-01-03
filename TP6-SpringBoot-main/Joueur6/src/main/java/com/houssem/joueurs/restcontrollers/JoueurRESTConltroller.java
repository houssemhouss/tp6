package com.houssem.joueurs.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.houssem.joueurs.entities.Joueur;
import com.houssem.joueurs.service.JoueurService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class JoueurRESTConltroller {
	@Autowired
	JoueurService JoueurService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Joueur> getAllJoueurs() {
	return JoueurService.getAllJoueurs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Joueur getJoueurById(@PathVariable("id") Long id) {
	return JoueurService.getJoueur(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Joueur createJoueur(@RequestBody Joueur Joueur) {
	return JoueurService.saveJoueur(Joueur);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Joueur updateJoueur(@RequestBody Joueur Joueur) {
	return JoueurService.updateJoueur(Joueur);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteJoueur(@PathVariable("id") Long id)
	{
		JoueurService.deleteJoueurById(id);
	}
	
	@RequestMapping(value="/vehimar/{idM}",method = RequestMethod.GET)
	public List<Joueur> getJoueursByMarId(@PathVariable("idM") Long idM) {
	return JoueurService.findByEquipeIdM(idM);
	}
	
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Joueur> getAlllJoueurs() {
	return JoueurService.getAllJoueurs();
	}
	
	
}
