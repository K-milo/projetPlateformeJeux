package com.jeux.plateforme;
import com.jeux.belote.Belote;
import com.jeux.tarot.Tarot;

public class PlateformeCarte implements PlateformeJeux{
	
	public Jeu nouveauJeu(TypeJeu jeu){
		switch(jeu){
			case TAROT:
				return new Tarot();
			case BELOTE:
				return new Belote();
			default:
				return null;
		}
	}
}
