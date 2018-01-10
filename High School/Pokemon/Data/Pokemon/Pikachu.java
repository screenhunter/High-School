package Pokemon;

import Repo.Move;
import Repo.Pokemon;

public class Pikachu extends Pokemon {
	
	public Pikachu(Move[] list, int l, String s) {
		
		moves = new Move[4];
		
		for (int i = 0; i < 4; i++)
			moves[i] = list[i];
		
		hp = 274;
		atk = 229;
		def = 174;
		spA = 218;
		spD = 196;
		spe = 306;
		lvl = l;
		name = s;
		
	}

}
