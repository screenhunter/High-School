/*
PROG: concom
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class concom {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static int[][] amt;
	public static boolean[][] own;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("concom.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("concom.out")));

		amt = new int[101][101];

		own = new boolean[101][101];
		for (int i = 1; i < 101; i++)
			own[i][i] = true;
		

		N = Integer.parseInt(in.readLine());

		String[] line;
		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			add(Integer.parseInt(line[0]), Integer.parseInt(line[1]),
					Integer.parseInt(line[2]));

		}

		for (int i = 1; i < 101; i++)
			for (int j = 1; j < 101; j++)
				if (i != j && own[i][j])
					out.println(i + " " + j);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void add(int a, int b, int val) {

		for (int i = 1; i < 101; i++)
			if (own[i][a])
				amt[i][b] += val;

		for (int i = 1; i < 101; i++)
			if (amt[i][b] > 50)
				update(i, b);

	}

	private static void update(int a, int b) {

		if (own[a][b])
			return;

		own[a][b] = true;
		
		for (int i = 1; i < 101; i++)
			amt[a][i] += amt[b][i];

		for (int i = 1; i < 101; i++)
			if (own[i][a])
				update(i, b);

		for (int i = 1; i < 101; i++)
			if (amt[a][i] > 50)
				update(a, i);

	}

}