package com.houssem.joueurs.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.houssem.joueurs.entities.Equipe;
import com.houssem.joueurs.entities.Joueur;


@RepositoryRestResource(path ="rest")
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	/*@Query("select  jo from Joueur jo where vh.nomJoueur like %?1 and vh.prixJoueur > ?2")
	List<Joueur> findByNomPrix (String nom, Double prix);*/
	
	@Query("select jo from Joueur vh where vh.nomJoueur like %:nom and jo.prixJoueur > :prix")
	List<Joueur> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	@Query("select vh from Joueur vh where vh.marque = ?1")
	List<Joueur> findByEquipe (Equipe equipe);
	List<Joueur> findByEquipeIdM(Long id);
	List<Joueur> findByOrderByNomJoueurAsc();

	@Query("select jo from Joueur jo order by vh.nomJoueur ASC, vh.prixJoueur DESC")
	List<Joueur> trierJoueursNomsPrix ();

}
