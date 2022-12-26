package Groupe;

public class Sport {
	String nomSport;
	int nbrPhaseDeJeu;
	public Sport(String nomSport,int nbrPhaseDeJeu,int nombreMinutesParPhaseDeJeuReglementaire, int dureeMax,int nombreJoueurSurTerrainMax){
		this.nomSport = nomSport;
	}
	
	public void afficherNomSport() {
		System.out.println(nomSport);
	}

	public String getNomSport() {
		return nomSport;
	}

}
