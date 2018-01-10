package Repo;

public abstract class Move {
	
	/*
	 * 
	 * if (sp)
			bd = ((((2 * x.lvl()) / 5 + 2) * bp * x.spA()) / y.spD()) / 50 + 2;
		else 
			bd = ((((2 * x.lvl()) / 5 + 2) * bp * x.atk()) / y.def()) / 50 + 2;
	 * 
	 */
	
	protected static int bp;
	protected double accuracy;
	
	public abstract void attack(Pokemon x, Pokemon y);

}
