import java.util.ArrayList;

public class Coordonnees {
	private int largeur;
	private int hauteur;
	private ArrayList<Coordonnees> list;

	public Coordonnees(int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}
	
	public int getHauteur(){
		return hauteur;
	}
	
	public String toString(){
		return "[" + this.hauteur + " " + this.largeur + "]";
	}
	
	public Coordonnees ajout(Coordonnees coord){
		list.add(coord);
		return coord;
	}
}