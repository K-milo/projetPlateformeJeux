package com.jeux.plateforme;

import com.jeux.jeu421.Jeu421;

public class PlateformeDe  implements PlateformeJeux{
	
	public Jeu nouveauJeu(TypeJeu jeu){
		switch(jeu){
			case JEU421:
				return new Jeu421();
			default:
				return null;
		}
	}

}
