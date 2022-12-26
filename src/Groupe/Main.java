package Groupe;

public class Main {

	public static void main(String[] args) {


		System.out.println("test: \n");
		
	System.out.println("Creation de sport:\n");
	Sport football = new Sport("football",2,45,120,22);
	Sport rugby = new Sport("rugby XV",2,40,100,30);
	Sport footUS = new Sport("Football Americain",4,15,75,22);
	Sport Handball = new Sport("Handball",2,30,70,14);

	
	football.afficherNomSport();
	rugby.afficherNomSport();
	footUS.afficherNomSport();

	
	System.out.println("\n Creation d'une saison:\n");
	Saison Saison2021 = new Saison(2021);
	Saison2021.afficherAnnee();
	
	System.out.println("\n Ajout d'un sport \n");
	Saison2021.ajouterSport(football);
	Saison2021.ajouterSport(rugby);
	Saison2021.ajouterSport(footUS);
	Saison2021.ajouterSport(Handball);

	
	System.out.println("Enumérations de/s sport/s ajouté/s:");
	Saison2021.EnumerationSports();
	
	System.out.println("\n Suppressions de sport: \n");
	Saison2021.supprimerSport("rugby XV");
	Saison2021.EnumerationSports();
	
	
}
}
