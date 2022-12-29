package Groupe;

public class Pro extends Joueur {
public String nom;
public int age;
public int taille;
public int poids;
public int valeur;
private int salaire; // stats csv entre valeur etc age etc avec les stats pour faire la valeur

	public Pro(String nom, int age, int taille,int poids, int valeur, int salaire) {
		
		super(nom, age, taille);

	}
}