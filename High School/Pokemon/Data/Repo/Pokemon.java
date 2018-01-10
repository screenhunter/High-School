package Repo;

public class Pokemon {

	protected Move moves[];
	protected int hp;
	protected int atk;
	protected int def;
	protected int spA;
	protected int spD;
	protected int spe;
	protected int lvl;
	protected String name;
	
	public int hp() {
		
		return hp;
	}
	
	public int atk() {
		
		return atk;
		
	}
	
	public int def() {
		
		return def;
		
	}
	
	public int spA() {
		
		return spA;
		
	}
	
	public int spD() {
		
		return spD;
		
	}
	
	public int spe() {
		
		return spe;
		
	}
	
	public int lvl() {
		
		return lvl;
		
	}
	
	public String name() {
		
		return name;
		
	}

	public void damage(int i) {

		hp -= i;
		
	}
	
	public void attack(Pokemon x, int index) {
		
		System.out.println("*");
		
		System.out.println(moves[index].accuracy);
		
		if (moves[index].accuracy >  Math.random()) {
			System.out.println("**");
			moves[index].attack(this, x);
		}
		
	}
	
}
