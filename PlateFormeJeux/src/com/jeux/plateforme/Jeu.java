package com.jeux.plateforme;

import java.util.ArrayList;

public abstract class Jeu {
	protected ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	
	public abstract void jouer();
	
	public boolean nouveauJoueur(Joueur j){
		return joueurs.add(j);
	}
}
