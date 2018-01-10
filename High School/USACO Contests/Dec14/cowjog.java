/*
rkhanna 
Rajat Khanna
12/13/2014
prog: cowjog
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class cowjog {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, T;
	public static HashMap<Long, Long> start;
	public static ArrayList<Long> end;
	public static int[][] data;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("cowjog.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("cowjog.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		T = Integer.parseInt(line[1]);
		end = new ArrayList<Long>();
		start = new HashMap<Long, Long>();
		data = new int[N][2];

		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			data[i][0] = Integer.parseInt(line[0]);
			data[i][1] = Integer.parseInt(line[1]);

		}
		long x, s;
		for (int i = N - 1; i >= 0; i--) {
			x = data[i][0];
			s = data[i][1];
			
			if (start.get(x + T * s) == null) {

				long prev;
				long offset = 0;
				long cur = x;
				while (start.get(x + 7 * s - offset) != null) {

					prev = start.get(x + 7 * s - offset);
					start.put(x + T * s - offset, cur);
					cur = prev;
					offset++;

				}

				start.put(x + T * s - offset, cur);

			}

		}

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
