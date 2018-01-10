import Moves.Thunderbolt;
import Pokemon.Pikachu;
import Repo.Move;
import Repo.Pokemon;


public class Battle {
	
	public static void main(String[] args) {
		
		Move[] temp = {new Thunderbolt(), new Thunderbolt(), new Thunderbolt(), new Thunderbolt()};
		
		Pokemon p1 = new Pikachu(temp, 100, "Pika");
		Pokemon p2 = new Pikachu(temp, 100, "Chu");
		
		p1.attack(p2, 0);
		System.out.println(p2.hp());
		System.out.println(p1.hp());
		
		
	}

}
