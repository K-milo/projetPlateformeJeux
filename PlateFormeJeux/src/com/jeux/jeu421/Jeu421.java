package com.jeux.jeu421;

import com.jeux.plateforme.Jeu;

public class Jeu421 extends Jeu {

	public void jouer(){
		if(joueurs.get(0) instanceof Joueur421){
			  Joueur421 j = (Joueur421)joueurs.get(0);
			  j.premierLance();
		}
		
	}
	
}
