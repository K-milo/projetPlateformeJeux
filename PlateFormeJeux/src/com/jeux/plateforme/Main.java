package com.jeux.plateforme;
import java.util.ArrayList;

import com.jeux.jeu421.Joueur421;

public class Main {

	public static void main(String[] args) {
		PlateformeJeux plateformeDe = new PlateformeDe();
		
		Jeu jeu421 = plateformeDe.nouveauJeu(TypeJeu.JEU421);
		jeu421.nouveauJoueur(new Joueur421("Mathieu"));
		jeu421.nouveauJoueur(new Joueur421("Camilo"));
		jeu421.jouer();
		
	}

}
