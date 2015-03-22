
public abstract class Action{
	protected Robot r;
	protected Coordonnees direction;

	public Action(Robot r, Coordonnees direction){
		this.r = r;
		this.direction = direction;
	}
	
	public Robot getRobot(){
		return this.r;
	}
	
	public abstract void agit();
}