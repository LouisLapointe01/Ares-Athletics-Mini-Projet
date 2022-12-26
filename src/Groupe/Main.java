package Groupe;

public class Main {

	public static void main(String[] args) {


		System.out.println("test: \n");
		
	System.out.println("Creation de sport:\n");
	Sport football = new Sport("football");
	Sport rugby = new Sport("rugby");
	Sport tennis = new Sport("tennis");
	
	football.afficherNomSport();
	rugby.afficherNomSport();
	tennis.afficherNomSport();

	
	System.out.println("\n Creation d'une annee:\n");
	Annee Annee2021 = new Annee(2021);
	Annee2021.afficherAnnee();
	
	System.out.println("\n Ajout de sport \n");
	Annee2021.ajouterSport(football);
	Annee2021.ajouterSport(rugby);
	Annee2021.ajouterSport(tennis);
	
	System.out.println("Enumérations de/s sport/s ajouté/s:");
	Annee2021.EnumerationSports();
	
}
}
