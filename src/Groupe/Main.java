package Groupe;

public class Main {

	public static void main(String[] args) {


		System.out.println("test: \n");
		
	System.out.println("Creation de sport:\n");
	Sport football = new Sport("football",2,45,120,22);
	Sport rugby = new Sport("rugby XV",2,40,100,30);
	Sport footUS = new Sport("Football Americain",4,15,75,22);

	
	football.afficherNomSport();
	rugby.afficherNomSport();
	footUS.afficherNomSport();

	
	System.out.println("\n Creation d'une annee:\n");
	Annee Annee2021 = new Annee(2021);
	Annee2021.afficherAnnee();
	
	System.out.println("\n Ajout de sport \n");
	Annee2021.ajouterSport(football);
	Annee2021.ajouterSport(rugby);
	Annee2021.ajouterSport(footUS);

	
	System.out.println("Enumérations de/s sport/s ajouté/s:");
	Annee2021.EnumerationSports();
	
	System.out.println("\n Suppressions de sport: \n");
	Annee2021.supprimerSport("rugby XV");
	Annee2021.EnumerationSports();
	
	
}
}
