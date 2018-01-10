/*
rkhanna
Rajat Khanna
12/15/2012
PROG: name
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class scramble {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static String[][] names;
	public static String[] forward, backward;
	public static int[][] pos;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("scramble.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("scramble.out")));

		N = Integer.parseInt(in.readLine());
		names = new String[N][2];
		forward = new String[N];
		backward = new String[N];

		char[] line;
		for (int i = 0; i < N; i++) {

			line = in.readLine().toCharArray();
			Arrays.sort(line);
			
			names[i][0] = new String(line);
			names[i][1] = new StringBuffer(names[i][0]).reverse().toString();
			forward[i] = names[i][0];
			backward[i] = names[i][1];
		}

		Arrays.sort(forward);
		Arrays.sort(backward);

		pos = new int[N][2];

		for (int i = 0; i < N; i++) {

			pos[i][0] = Arrays.binarySearch(backward, names[i][0]);
			if (pos[i][0] < 0)
				pos[i][0] = -pos[i][0] - 1;
			pos[i][0]++;
			
			pos[i][1] = Arrays.binarySearch(forward, names[i][1]);
			if (pos[i][1] < 0)
				pos[i][1] = -pos[i][1] - 2;
			pos[i][1]++;

		}

		for (int i = 0; i < N; i++)
			out.println(pos[i][0] + " " + pos[i][1]);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
