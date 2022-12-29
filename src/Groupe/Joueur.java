package Groupe;

public class Joueur {
	
	int nombreDePoint = 0;
	int nombreDePasseReussi = 0;
	int nombreDePasse = 0;
	int distanceParcouru = 0;
	int nombreMatchTotal = 0;
	int nombreMatchTitulaire = 0;
	String nomJoueur;
	
	public Joueur(String nomJoueur, int ageJoueur, int tailleJoueur) { 
		this.nomJoueur = nomJoueur;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	
}

