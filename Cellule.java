
public abstract class Cellule {
	protected int mine = 0;
	protected int base = 0;
	protected String image;
	protected int hauteur;
	protected int largeur;
	
	public Cellule(int largeur, int hauteur){
		this.hauteur = largeur;
		this.largeur = largeur;
	}
	
	public abstract void deplaceSur(Robot robot);
	public abstract void ajoute(int equipe);
	public abstract void videCase();
}