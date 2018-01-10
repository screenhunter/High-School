/*
PROG: calfflac
LANG: JAVA
 */



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class calfflac {

	private static char[] line;
	private static char[] fixed;
	private static int sPos;
	private static int ePos;
	private static int count;

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(new File("calfflac.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"calfflac.out")));

		String temp = "";
		count = 0;

		while (in.hasNext()) {

			temp += in.nextLine() + "\n";

		}

		line = temp.toCharArray();
		temp = temp.toLowerCase();
		fixed = temp.toCharArray();
		for (int i = 0; i < fixed.length; i++)
			if (!Character.isLetter(fixed[i]))
				fixed[i] = '*';

		sPos = 0;
		ePos = 1;

		for (int i = 0; i < line.length; i++) {

			if (!Character.isLetter(fixed[i]))
				continue;

			int x = i;
			int y = i;
			check(x, y);

			x = i;
			y = i + 1;
			check(x, y);

			x = i - 1;
			y = i;
			check(x, y);

		}

		out.println(ePos - sPos + 1 - count);
		out.println(String.copyValueOf(Arrays.copyOfRange(line, sPos, ePos + 1)));

		in.close();
		out.close();
		System.exit(0);

	}

	private static void check(int x, int y) {
		
		int tcount = 0;

		while (x >= 0 && fixed[x] == '*') {
			
			x--;
			tcount++;
			
		}
		
		while (y < line.length && fixed[y] == '*') {
			
			y++;
			tcount++;
			
		}

		while (x >= 0 && y < line.length && fixed[x] == fixed[y]) {
			
			x--;
			y++;
			
			while (x >= 0 && fixed[x] == '*') {
				
				x--;
				tcount++;
				
			}
			
			while (y < line.length && fixed[y] == '*') {
				
				y++;
				tcount++;
				
			}
			
		}
		
		x++;
		y--;
		
		while (x < line.length && fixed[x] == '*') {
			
			x++;
			tcount--;
			
		}
		
		while (y >= 0 && fixed[y] == '*') {
			
			y--;
			tcount--;
			
		}
		
		if (y - x - tcount > ePos - sPos - count) {

			sPos = x;
			ePos = y;
			count = tcount;

		}
		
		if (y - x - tcount == ePos - sPos - count) {
			
			if (x > sPos && y < ePos) {
				
				sPos = x;
				ePos = y;
				count = tcount;
				
			}
			
		}

	}
}
