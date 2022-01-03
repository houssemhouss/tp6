package com.houssem.joueurs.entities;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idE;
	private String nomE;
	private String descriptionE;
	
	@JsonIgnore
	@OneToMany (mappedBy="equipe")
	private List<Joueur> joueurs;


	public Equipe( String nomE, String descriptionE, List<Joueur> joueur) {
		super();
	
		this.nomE = nomE;
		this.descriptionE = descriptionE;
		this.joueurs = joueurs;
	}
}



