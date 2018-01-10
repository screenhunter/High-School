package Dec13;
/*
rkhanna
Rajat Khanna
XX/XX/2014
PROG: name
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class vacation {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M, K, Q, count, max;
	public static long sum;
	public static int[][] flights;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("vacation.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("vacation.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		K = Integer.parseInt(line[2]);
		Q = Integer.parseInt(line[3]);
		max = 100000000;
		flights = new int[N + 1][N + 1];

		for (int i = 1; i < N + 1; i++) {
			
			Arrays.fill(flights[i], max);
			flights[i][i] = 0;
			
		}

		for (int i = 0; i < M; i++) {

			line = in.readLine().split(" ");
			flights[Integer.parseInt(line[0])][Integer.parseInt(line[1])] = Integer.parseInt(line[2]);

		}

		for (int k = 1; k < N + 1; k++)
			for (int i = 1; i < N + 1; i++)
				for (int j = 1; j < N + 1; j++)
					flights[i][j] = Math.min(flights[i][j], flights[i][k]
							+ flights[k][j]);
		
		sum = 0;
		count = 0;
		int temp = max;
		for (int counter = 0; counter < Q; counter++) {
			
			line = in.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			
			for (int i = 1; i <= K; i++)
					temp = Math.min(flights[a][i] + flights[i][b], temp);
			
			if (temp < max) {
				
				sum += temp;
				count++;
				temp = Integer.MAX_VALUE;
				
			}
			
		}
		
		out.println(count + "\n" + sum);
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
