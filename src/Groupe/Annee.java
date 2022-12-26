package Groupe;


public class Annee {
public Sport[] tabSport;
int nombreSport = 0;
	
public int numero; 

	public Annee(int numero) {
		this.numero = numero;
		tabSport = new Sport[100];
	}
	
public void ajouterSport(Sport nom) {
	tabSport[nombreSport] = nom;
	nombreSport ++;
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
