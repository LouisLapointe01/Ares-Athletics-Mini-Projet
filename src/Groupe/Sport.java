package Groupe;

public class Sport {
	String nomSport; int nbrPhaseDeJeu ; int minPhaseJeu ; int dureeMax ; int nombreJoueurTerrainMax;
	
	public Sport(String nomSport,int nbrPhaseDeJeu,int minPhaseJeu, int dureeMax,int nombreJoueurTerrainMax){
		
		this.nomSport = nomSport;
	}
	
	public void afficherNomSport() {
		System.out.println(nomSport);
	}

	public String getNomSport() {
		return nomSport;
	}

	public int getNbrPhaseDeJeu() {
		return nbrPhaseDeJeu;
	}

	public int getMinPhaseJeu() {
		return minPhaseJeu;
	}

	public int getDureeMax() {
		return dureeMax;
	}

	public int getNombreJoueurTerrainMax() {
		return nombreJoueurTerrainMax;
	}

}
