package Moves;

import Repo.Move;
import Repo.Pokemon;

public class Tackle extends Move {

	public Tackle() {

		bp = 50;
		accuracy = 1.0;

	}

	public void attack(Pokemon x, Pokemon y) {

		int bd = ((((2 * x.lvl()) / 5 + 2) * bp * x.atk()) / y.def()) / 50 + 2;

		y.damage(bd);

		System.out.println(x.name() + " used Thunderbolt!");
		System.out.println(y.name() + " took " + bd + " damage!");

	}

}
