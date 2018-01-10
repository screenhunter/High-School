import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;


public class Organizer {
	
	private static BufferedReader in;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new FileReader("Datamine.json"));
		
		in.close();
		
	}

}

class Unit {
	
	private String name;
	private int HP, ATK, DEF, REC;
	private BB bb, sbb;
	
}

class BB {
	
	private String name, desc, target, area;
	private int cost;
	private HashMap<String, String> effects;
	
}