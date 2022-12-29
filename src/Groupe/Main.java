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
	
	Equipe FcPaulSab = new Equipe(football);
	Equipe OL = new Equipe(football);
	
	Amateur Lapointe = new Amateur("Louis Lapointe",24,188,"Avant Centre","Toulouse");
	Pro Cherki = new Pro("Rayan Cherki",21,178,79,18000000,109000);
	Pro Dumas = new Pro("Michel Dumas",23,211,130,18000000,109000);
	Pro Pons = new Pro("Lilian Pons",29,198,89,1800,400000);
	Pro Kante = new Pro("De Kante",39,198,87,140000,1000);
	
	System.out.println("\n");
	FcPaulSab.ajouterJoueur(Lapointe);
	OL.ajouterJoueur(Cherki);
	OL.ajouterJoueur(Dumas);
	OL.ajouterJoueur(Pons);
	OL.ajouterJoueur(Kante);
	
	System.out.println("Enum Joueur puis supression:");
	OL.EnumerationJoueur();
	OL.supprimerJoueur("Michel Dumas");
	System.out.println("\n");
	OL.EnumerationJoueur();
	
}
}
