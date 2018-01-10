
/*
prog: USACO
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class feast {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int T, A, B;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("feast.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("feast.out")));

		String[] line = in.readLine().split(" ");
		T = Integer.parseInt(line[0]);
		A = Integer.parseInt(line[1]);
		B = Integer.parseInt(line[2]);

		int modA = T % A;
		int modB = T % B;
		int modAB = T % A % B;

		int c = Math.min(T, modAB);
		if (modA >= A / 2)
			c = Math.min(c, modA - A / 2);
		if (modB >= B / 2)
			c = Math.min(c, modB - B / 2);
		if (modAB >= A / 2)
			c = Math.min(T, modAB - A / 2);
		if (modAB >= B / 2)
			c = Math.min(T, modAB - B / 2);
		if (modAB >= A / 2 + B / 2)
			c = Math.min(c, (T % B) % A - B / 2 - A / 2);
		
		out.println(T-c);

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
