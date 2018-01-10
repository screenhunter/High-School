/*
 * Rajat Khanna 10th Grade
 * Thomas Jefferson High School for Science and Technology
 * Senior Division
 * Contest#1 2013-2014
 * ACSL Scrabble
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Khanna_Rajat_ACSL_Scrabble {

	public static BufferedReader in;
	public static HashMap<Character, Integer> map; //contains point values of characters
	public static boolean[][] multipliers; // DL, TL, DW, TW //states whether specific square has a type of multiplier
	public static String word; //word we are using

	public static void main(String[] args) throws IOException {

		info();
		in = new BufferedReader(new FileReader("acsl.in"));

		word = in.readLine().replaceAll(",", ""); //gets rid of all commas

		for (int i = 1; i <= 5; i++)
			System.out
					.println(i + ". " + compute(in.readLine().split(",")));
		
		in.close();
		System.exit(0);

	}

	private static void info() { //precomputes data needed

		map = new HashMap<Character, Integer>();
		map.put('A', 1);
		map.put('E', 1);
		map.put('D', 2);
		map.put('R', 2);
		map.put('B', 3);
		map.put('M', 3);
		map.put('V', 4);
		map.put('Y', 4);
		map.put('J', 8);
		map.put('X', 8);
		
		multipliers = new boolean[4][41];
		for (int i = 3; i <= 40; i += 6)
			multipliers[0][i] = true;
		for (int i = 5; i <= 40; i += 5)
			if (!multipliers[0][i])
				multipliers[1][i] = true;
		for (int i = 7; i <= 40; i += 7)
			if (!multipliers[0][i] && !multipliers[1][i])
				multipliers[2][i] = true;
		for (int i = 8; i <= 40; i += 8)
			if (!multipliers[0][i] && !multipliers[1][i] && !multipliers[2][i])
				multipliers[3][i] = true;

	}

	private static int compute(String[] input) { //calculates max point value on the board

		int max = 0;

		for (int i = 0; i < 6; i += 2) { //iterates through 3 words

			int[] loc = new int[4]; //positions of each letter
			loc[0] = Integer.parseInt(input[i]);

			if (input[i + 1].equals("H")) //horizontal
				for (int j = 1; j < 4; j++)
					loc[j] = loc[j - 1] + 1;
			else //vertical
				for (int j = 1; j < 4; j++)
					loc[j] = loc[j - 1] + 10;

			int score = calculate_score(loc);

			if (score > max)
				max = score;

		}

		return max;

	}

	private static int calculate_score(int[] loc) { //calucaltes score given locations

		int score = 0;

		boolean dword = false;
		boolean tword = false;

		for (int i = 0; i < 4; i++) {

			boolean dletter = multipliers[0][loc[i]];
			boolean tletter = multipliers[1][loc[i]];
			dword = dword || multipliers[2][loc[i]];
			tword = tword || multipliers[3][loc[i]]; //checks for multipliers

			score += map.get(word.charAt(i));
			if (dletter)
				score += map.get(word.charAt(i));
			if (tletter)
				score += 2 * map.get(word.charAt(i));

		}

		if (dword)
			score *= 2;
		if (tword)
			score *= 3;

		return score;
	}

}
