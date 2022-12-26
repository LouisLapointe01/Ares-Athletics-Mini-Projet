package Groupe;

public class Sport {
	String nomSport;
	
	public Sport(String nomSport) {
		this.nomSport = nomSport;
	}
	
	public void afficherNomSport() {
		System.out.println(nomSport);
	}

	public String getNomSport() {
		return nomSport;
	}

}
