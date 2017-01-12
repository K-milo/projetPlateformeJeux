package com.jeux.jeu421;

import java.util.Scanner;

import com.jeux.plateforme.Joueur;

public class Joueur421 extends Joueur{
	private boolean chef = false;
	private int nbJetons=0;
	private int[] de = new int[3];
	private int nbLance=0;

	//***********
	public Joueur421(String nom){
		super(nom);
	}
	//***********
	public int getNbLance(){
		return nbLance;
	}
	public void premierLance(){
		System.out.print("Résultat du premier lancer : ");
		for(int i=0 ; i < de.length; i++){
			de[i] = (int)( Math.random() * 6)+1 ;
			System.out.print(de[i] + ", ");
		}
		nbLance++;
		while(reLance() != 0);
		
	}
	
	private int reLance(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de dés voulez vous relancer ? ");
		int nbde = sc.nextInt();
		
		if (nbde > 0){
			for(int i =0 ; i < nbde; i++){
				System.out.println("Quel numéro de dé à relancer ?");
				int indexDe = sc.nextInt();
				de[indexDe-1] = (int)( Math.random() * 6)+1 ;
			}
			
			System.out.print("Nouvelles valeurs des dés : ");
			for(int i=0 ; i < de.length; i++){
				System.out.print(de[i] + ", ");
			}
			nbLance++;
		}
		return nbde;
	}
	public int[] getDe() {
		return de;
	}
	public void setDe(int[] de) {
		this.de = de;
	}
	

}
