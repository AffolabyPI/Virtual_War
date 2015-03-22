
public abstract class Robot {
	private int energie;
	private int equipe;
	private Vue vue;
	
	public Robot (Vue vue, int i, int h, int equipe){
		this.vue = vue;
		this.equipe = equipe;
	}
	
	abstract public boolean peutTirer();
	
	public boolean estSurBase(){
		return false;
	}
}