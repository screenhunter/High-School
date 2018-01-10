
/*
 rkhanna
 Rajat Khanna
 12/15/2012
 PROG: scramble
 LANG: JAVA
 */

import java.io.*;
import java.util.*;

public class scramble {

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("scramble.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"scramble.out")));

		int num = Integer.parseInt(in.readLine());
		String[][] names = new String[num][3];
		SortedSet<String> reg = new TreeSet<String>();
		SortedSet<String> rev = new TreeSet<String>();

		for (int i = 0; i < num; i++) {

			names[i][0] = in.readLine();
			names[i][0] = names[i][0].trim();
			char[] line = names[i][0].toCharArray();
			Arrays.sort(line);
			names[i][1] = new String(line);
			reg.add(names[i][1]);

			names[i][2] = new StringBuffer(names[i][1]).reverse().toString();

			rev.add(names[i][2]);

		}

		for (int i = 0; i < num; i++) {

			SortedSet<String> temp = reg;
			SortedSet<String> temprev = rev;

			reg.remove(names[i][1]);
			reg.add(names[i][2]);

			rev.remove(names[i][2]);
			rev.add(names[i][1]);

			int x = (reg.headSet(names[i][2]).size() + 1);
			int y = (rev.headSet(names[i][1]).size() + 1);
			if (x > y)
				out.println(y + " " + x);
			else
				out.println(x + " " + y);

			reg = temp;

			rev = temprev;

		}

		// long endTime = System.nanoTime();
		// System.out.println("Took "+(endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
