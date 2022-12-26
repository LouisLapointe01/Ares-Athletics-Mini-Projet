package Groupe;

import java.util.Arrays;

public class Saison {
public Sport[] tabSport;
int nombreSport = 0;
	
public int numero; 

	public Saison(int numero) {
		this.numero = numero;
		tabSport = new Sport[100];
	}
	
public void ajouterSport(Sport nom) {
	tabSport[nombreSport] = nom;
	nombreSport ++;
}

/* public void supprimerSport(Sport nom) {
	for(int i = 0; i < nombreSport; i++) {
		if("tabSport[i].getNomSport()" == nom.getNomSport()) {
			tabSport[i+1] = tabSport[i-1];
			
		}
	}
}*/
public void supprimerSport(String nom) {
	
	int index = 1002;
	
	for(int i = 0; i < nombreSport; i++) {
		
		if(tabSport[i].getNomSport() == nom) {
			index = i;	
		}
	}
	
	assert(index > tabSport.length) : "Error : Sport à supprimer introuvable dans le tableau ";
	

    // Vérifie que l'index est valide (compris entre 0 et la taille du tableau - 1)
    if (index < 0 || index >= tabSport.length) {
        throw new IndexOutOfBoundsException();
    }

    // Déplace tous les éléments après l'index vers la gauche d'un cran
    for (int i = index; i < tabSport.length - 1; i++) {
        tabSport[i] = tabSport[i + 1];
    }

    // Réduit la taille du tableau d'un cran
    tabSport = Arrays.copyOf(tabSport, tabSport.length - 1);
    nombreSport--;
}

public void EnumerationSports()
{
	for(int i = 0; i < nombreSport; i++) {
		System.out.println(tabSport[i].getNomSport());
	}
}

public void afficherAnnee() {
	System.out.println(numero);
}
public int getAnnee() {
	return numero;
}


}
