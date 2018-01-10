/*
rkhanna
Rajat Khanna
12/15/2012
PROG: cowrace
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class cowrace {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M;
	public static int[][] race;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("cowrace.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("cowrace.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		race = new int[1000000][2];

		int index = 0, dist = 0;
		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");

			for (int j = 0; j < Integer.parseInt(line[1]); j++) {

				dist += Integer.parseInt(line[0]);
				race[index][0] = dist;
				index++;

			}

		}

		index = 0;
		dist = 0;
		for (int i = 0; i < M; i++) {

			line = in.readLine().split(" ");

			for (int j = 0; j < Integer.parseInt(line[1]); j++) {

				dist += Integer.parseInt(line[0]);
				race[index][0] = dist;
				index++;

			}

		}
		
		compare();

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void compare() {
		
		
		
	}

}
