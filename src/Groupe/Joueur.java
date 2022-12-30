package groupe;

public class Joueur {
	
	int nombreDePoint = 0;
	int nombreDePasseReussi = 0;
	int nombreDePasse = 0;
	int distanceParcouru = 0;
	int nombreMatchTotal = 0;
	int nombreMatchTitulaire = 0;
	int ageJoueur = 0;
	int tailleJoueur = 0;
	String nomJoueur;
	
	public Joueur(String nomJoueur, int ageJoueur, int tailleJoueur) { 
		this.nomJoueur = nomJoueur;
	}

	public int ajouterNombreDePoint(int nombre) {
		nombreDePoint = nombreDePoint + nombre;
		return nombreDePoint;
	}
	
	public int ajouterNombreDePasse(int nombre) {
		nombreDePasse = nombreDePasse + nombre;
		return nombreDePasse;
	}
	
	public int ajouterNombreDePasseReussi(int nombre) {
		nombreDePasseReussi = nombreDePasseReussi + nombre;
		return nombreDePasseReussi;
	}
	
	public int distanceParcouru(int nombre) {
		distanceParcouru = distanceParcouru + nombre;
		return distanceParcouru;
	}
	public int nombreMatchTotal(int nombre) {
		nombreMatchTotal = nombreMatchTotal + nombre;
		return nombreMatchTotal;
	
	}
	public int nombreMatchTitulaire(int nombre) {
		nombreMatchTitulaire = nombreMatchTitulaire + nombre;
		return nombreMatchTitulaire;
	}

	public int getAgeJoueur() {
		return ageJoueur;
	}

	public int getTailleJoueur() {
		return tailleJoueur;
	}
	public String getNomJoueur() {
		return nomJoueur;
	}
}

