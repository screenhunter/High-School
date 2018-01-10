/*
PROG: runround
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class runround {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int M;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("runround.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("runround.out")));

		M = Integer.parseInt(in.readLine());

		out.println(increment(M + 1));

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static long increment(long x) {
		
		while (!check(x + ""))
			x++;
		
		return x;

	}

	private static boolean check(String s) {

		boolean[] nums = new boolean[10];
		for (int i = 0; i < s.length(); i++) {

			if (nums[Integer.parseInt(s.substring(i, i + 1))] == true)
				return false;

			nums[Integer.parseInt(s.substring(i, i + 1))] = true;

		}

		boolean[] visited = new boolean[s.length()];
		int index = 0;
		int count = 0;
		while (true) {

			if (visited[index] == true)
				if (count == s.length() && index == 0)
					return true;
				else
					return false;

			visited[index] = true;
			index = (index + Integer.parseInt(s.substring(index, index + 1)))
					% s.length();
			count++;

		}

	}

}
