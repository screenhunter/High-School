/*
 * Made by Rajat Khanna
 * 7/13/2013
 * 
 * POLYATOMIC ION QUIZ
 * Test yourself on your polyatomic ions!
 * 
 * Note
 * For the questions answer the multiple names with:
 * bicarbonate, bisulfate, bisulfite, bisulfide, dihydrogen phosphate, monohydrogen phosphate, and phosphate
 * Capitalization counts for the formulas!
 */

package Chemistry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PolyatomicIonGame {

	public static BufferedReader in;
	public static HashMap<String, String> db;
	public static HashMap<String, String> charges;
	public static Object[] keys;
	public static int total;
	public static int score;

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		db = new HashMap<String, String>();
		charges = new HashMap<String, String>();
		update();

		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many questions?");
		total = Integer.parseInt(in.readLine());
		score = 0;

		keys = db.keySet().toArray();

		for (int i = 0; i < total; i++)
			score = play();

		System.out.println("Your final score is: " + score + "/" + total * 2);

	}

	private static int play() throws IOException {

		int index = (int) (Math.random() * keys.length);

		System.out.println("Convert " + (String) keys[index]);
		String line = in.readLine();
		if (line.equalsIgnoreCase(db.get((String) (keys[index])))) {

			System.out.println("Correct!");
			score++;

		} else
			System.out.println("Sorry, but the correct answer is "
					+ db.get((String) (keys[index])));

		System.out.println("Charge?");
		line = in.readLine();
		String line2 =line.charAt(1) + "" + line.charAt(0);
		if (line.equalsIgnoreCase(charges.get((String) (keys[index]))) || line2.equalsIgnoreCase(charges.get((String) (keys[index])))) {

			System.out.println("Correct!");
			score++;

		} else
			System.out.println("Sorry, but the correct answer is "
					+ charges.get((String) (keys[index])));

		System.out.println("Current score: " + score + "/" + total * 2);
		return score;

	}

	private static void update() {

		db.put("ammonium", "NH4");
		charges.put("ammonium", "+1");

		db.put("hydronium", "H3O");
		charges.put("hydronium", "+1");
		charges.put("H3O", "+1");

		db.put("acetate", "C2H3O2");
		charges.put("acetate", "-1");

		db.put("amide", "NH2");
		charges.put("amide", "-1");

		db.put("azide", "N3");
		charges.put("azide", "-1");

		db.put("hydrazide", "N2H3");
		charges.put("hydrazide", "-1");

		db.put("benzoate", "C7H5O2");
		charges.put("benzoate", "-1");

		db.put("bitartrate", "HC4H4O6");
		charges.put("bitartrate", "-1");

		db.put("bromate", "BrO3");
		charges.put("bromate", "-1");

		db.put("perchlorate", "ClO4");
		charges.put("perchlorate", "-1");

		db.put("chlorate", "ClO3");
		charges.put("chlorate", "-1");

		db.put("chlorite", "ClO2");
		charges.put("chlorite", "-1");

		db.put("hypochlorite", "ClO");
		charges.put("hypochlorite", "-1");

		db.put("cyanate", "OCN");
		charges.put("cyanate", "-1");

		db.put("cyanide", "CN");
		charges.put("cyanide", "-1");

		db.put("bicarbonate", "HCO3");
		charges.put("bicarbonate", "-1");

		db.put("bisulfate", "HSO4");
		charges.put("bisulfate", "-1");

		db.put("bisulfite", "HSO3");
		charges.put("bisulfite", "-1");

		db.put("bisulfide", "HS");
		charges.put("bisulfide", "-1");

		db.put("hydroxide", "OH");
		charges.put("hydroxide", "-1");

		db.put("iodate", "IO3");
		charges.put("iodate", "-1");

		db.put("triiodide", "I3");
		charges.put("triiodide", "-1");

		db.put("nitrate", "NO3");
		charges.put("nitrate", "-1");

		db.put("nitrite", "NO2");
		charges.put("nitrite", "-1");

		db.put("permanganate", "MnO4");
		charges.put("permanganate", "-1");

		db.put("dihydrogen phosphate", "H2PO4");
		charges.put("dihydrogen phosphate", "-1");

		db.put("thiocyanate", "SCN");
		charges.put("thiocyanate", "-1");

		db.put("carbonate", "CO3");
		charges.put("carbonate", "-2");

		db.put("chromate", "CrO4");
		charges.put("chromate", "-2");

		db.put("dichromate", "Cr2O7");
		charges.put("dichromate", "-2");

		db.put("monohydrogen phosphate", "HPO4");
		charges.put("monohydrogen phosphate", "-2");

		db.put("peroxidisulfate", "S2O8");
		charges.put("peroxidisulfate", "-2");

		db.put("pyrosulfate", "S2O7");
		charges.put("pyrosulfate", "-2");

		db.put("manganate", "MnO4");
		charges.put("manganate", "-2");

		db.put("oxalate", "C2O4");
		charges.put("oxalate", "-2");

		db.put("peroxide", "O2");
		charges.put("peroxide", "-2");

		db.put("phthalate", "C8H4O4");
		charges.put("phthalate", "-2");

		db.put("metasilicate", "SiO3");
		charges.put("metasilicate", "-2");

		db.put("sulfate", "SO4");
		charges.put("sulfate", "-2");

		db.put("sulfite", "SO3");
		charges.put("sulfite", "-2");

		db.put("thiosulfate", "S2O3");
		charges.put("thiosulfate", "-2");

		db.put("tartrate", "C4H4O6");
		charges.put("tartrate", "-2");

		db.put("tetraborate", "B4O7");
		charges.put("tetraborate", "-2");

		db.put("aluminate", "AlO3");
		charges.put("aluminate", "-3");

		db.put("arsenate", "AsO4");
		charges.put("arsenate", "-3");

		db.put("arsenite", "AsO3");
		charges.put("arsenite", "-3");

		db.put("borate", "BO3");
		charges.put("borate", "-3");
		
		db.put("citrate", "C6H5O7");
		charges.put("citrate", "-3");
		
		db.put("ferricyanide", "Fe(CN)6");
		charges.put("ferricyanide", "-3");
		
		db.put("phosphate", "PO4");
		charges.put("phosphate", "-3");
		
		db.put("phosphite", "PO3");
		charges.put("phosphite", "-3");
		
		db.put("ferrocyanide", "Fe(CN)6");
		charges.put("ferrocyanide", "-4");
		
		db.put("silicate", "SiO4");
		charges.put("silicate", "-4");
		
		for (String s : db.keySet())
			charges.put(db.get(s), charges.get(s));

		HashMap<String, String> temp = new HashMap<String, String>();

		for (String s : db.keySet())
			temp.put(db.get(s), s);

		for (String s : temp.keySet())
			db.put(s, temp.get(s));

	}

}