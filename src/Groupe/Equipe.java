package Groupe;

import java.util.Arrays;

public class Equipe {

	Joueur[] tabJoueur;
	int nombreJoueur = 0;
	public Equipe(Sport sportEquipe ) {

		tabJoueur = new Joueur[50];
	}

	public void ajouterJoueur(Joueur nomJoueur) {
		if(nombreJoueur < 50) {
			tabJoueur[nombreJoueur] = nomJoueur;
			nombreJoueur ++;
		}
	}
	
	public void supprimerJoueur(String nom) {
		
		int index = 52;
		
		for(int i = 0; i < nombreJoueur; i++) {
			
			if(tabJoueur[i].getNomJoueur() == nom) {
				index = i;	
			}
		}
		
		assert(index > tabJoueur.length) : "Error : Sport à supprimer introuvable dans le tableau ";
		

	    // Vérifie que l'index est valide (compris entre 0 et la taille du tableau - 1)
	    if (index < 0 || index >= tabJoueur.length) {
	        throw new IndexOutOfBoundsException();
	    }

	    // Déplace tous les éléments après l'index vers la gauche d'un cran
	    for (int i = index; i < tabJoueur.length - 1; i++) {
	        tabJoueur[i] = tabJoueur[i + 1];
	    }

	    // Réduit la taille du tableau d'un cran
	    tabJoueur = Arrays.copyOf(tabJoueur, tabJoueur.length - 1);
	    nombreJoueur--;
	}

	public void EnumerationJoueur()
	{
		for(int i = 0; i < nombreJoueur; i++) {
			System.out.println(tabJoueur[i].getNomJoueur());
		}
	}
}
