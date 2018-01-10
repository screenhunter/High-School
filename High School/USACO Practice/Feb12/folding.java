/*
rkhanna
Rajat Khanna
12/15/2012
PROG: folding
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class folding {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, L, count;
	public static int[] loc;
	public static boolean[] rope;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("folding.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("folding.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		L = Integer.parseInt(line[1]);
		loc = new int[N];
		rope = new boolean[L + 1];

		for (int i = 0; i < N; i++) {

			loc[i] = Integer.parseInt(in.readLine());
			rope[loc[i]] = true;

		}
		Arrays.sort(loc);

		count = 0;
		main: for (int i = 1; i < N; i++) {

			int fold = (loc[0] + loc[i]) / 2;
			for (int j = 1; j < N; j++)
				if (loc[j] > fold * 2)
					break;
				else if (!rope[2*fold - loc[j]])
					continue main;

			System.out.println(fold);
			
			count++;

		}
		
		reverse();
		reverse2();
		
		main: for (int i = 1; i < N; i++) {

			int fold = (loc[0] + loc[i]) / 2;
			for (int j = 1; j < N; j++)
				if (loc[j] > fold * 2)
					break;
				else if (!rope[2*fold - loc[j]])
					continue main;

			System.out.println(fold);
			
			count++;

		}
		
		out.println(count);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void reverse() {
		
		for (int i = 0; i < loc.length; i++)
			loc[i] = L - loc[i];

		for (int i = 0; i < loc.length / 2; i++) {
			
		    int temp = loc[i];
		    loc[i] = loc[loc.length - i - 1];
		    loc[loc.length - i - 1] = temp;
		    
		}
		
	}
	private static void reverse2() {

		for (int i = 0; i < rope.length / 2; i++) {
			
		    boolean temp = rope[i];
		    rope[i] = rope[rope.length - i - 1];
		    rope[rope.length - i - 1] = temp;
		    
		}
		
	}

}
