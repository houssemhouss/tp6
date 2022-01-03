package com.houssem.vehicules;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.houssem.joueurs.entities.Equipe;
import com.houssem.joueurs.entities.Joueur;
import com.houssem.joueurs.repos.JoueurRepository;





@SpringBootTest
class JoueursApplicationTests {
	@Autowired
	private JoueurRepository JoueurRepository;

	@Test
	public void testCreateJoueur() {
		Joueur prod = new Joueur("Velo",720.0,new Date());
		JoueurRepository.save(prod);
	}

	@Test
	public void testFindJoueur()
	{
		Joueur vh = JoueurRepository.findById(13L).get(); 
	System.out.println(vh);
	}
	
	@Test
	public void testUpdateJoueur()
	{
	Joueur vh =JoueurRepository.findById(13L).get();
	vh.setPrixJoueur(560800.0);
	vh.setNomJoueur("Train");
	JoueurRepository.save(vh);
	}
	
	@Test
	public void testDeleteJoueur()
	{
		JoueurRepository.deleteById(12L);;
	}

	
	@Test
	public void testListerTousJoueur()
	{
	List<Joueur> vhs = JoueurRepository.findAll();
	for (Joueur vh : vhs)
	{
	System.out.println(vh);
	}
	}
	
	@Test
	public void testFindByNomJoueur()
	{
		List<Joueur> vhs = JoueurRepository.findByNomJoueur("Velo");
		for (Joueur vh : vhs)
	{
				System.out.println(vh);
	}
	}
	@Test
		public void testFindByNomProduitContains ()
	{
		List<Joueur> vhs=JoueurRepository.findByNomJoueurContains("V");
		for (Joueur vh : vhs)
	{
				System.out.println(vh);
	} }
	
	@Test
		public void testfindByNomPrix()
	{
		List<Joueur> vhs = JoueurRepository.findByNomPrix("Joueur", 500.5);
		for (Joueur vh : vhs)
	{
				System.out.println(vh);
	}
	}
	
	@Test
	public void testfindByMarque()
	{
		Equipe m = new Equipe();
		m.setIdM(1L);
		List<Joueur> vhs =JoueurRepository.findByEquipe(m);
		for (Joueur vh : vhs)
	{
				System.out.println(vh);
	}
	}
	
	@Test
	public void findByEquipeIdM()
	{
	List<Joueur> vhs = JoueurRepository.findByEquipeIdM(2L);
	for (Joueur vh : vhs)
	{
	System.out.println(vh);
	}
	 }
	
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
		List<Joueur> vhs = JoueurRepository.findByOrderByNomJoueurAsc();
		for (Joueur vh : vhs)
	{
			System.out.println(vh);
	}
	}
	
	@Test
	public void testTrierJoueursNomsPrix()
	{
	List<Joueur> vhs = JoueurRepository.trierJoueursNomsPrix();
	for (Joueur vh : vhs)
	{
	System.out.println(vh);
	}
	}



	


}
