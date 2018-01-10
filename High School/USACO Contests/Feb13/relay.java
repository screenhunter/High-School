
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;

/*
 rkhanna
 Rajat Khanna
 2/9/2012
 PROG: relay
 LANG: JAVA
 */

public class relay {

	private static int N;
	private static int[] cows;
	private static HashSet<Integer> good = new HashSet<Integer>();
	private static HashSet<Integer> bad = new HashSet<Integer>();

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("relay.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"relay.out")));

		N = Integer.parseInt(in.readLine());

		cows = new int[N + 1];

		for (int i = 1; i < N + 1; i++)
			cows[i] = Integer.parseInt(in.readLine());

		for (int i = 1; i < N + 1; i++) {

			recur(i, new HashSet<Integer>());

		}

		out.println(good.size());

		// long endTime = System.nanoTime();
		// System.out.println("Took " + (endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

	private static void recur(int index, HashSet<Integer> x) {

		if (x.contains(index) || bad.contains(index)) {

			bad.addAll(x);
			return;

		}

		if (index == 0) {

			good.addAll(x);
			return;

		}

		x.add(index);

		recur(cows[index], x);

	}

}
