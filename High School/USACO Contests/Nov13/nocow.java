/*
rkhanna
Rajat Khanna
11/16/2013
PROG: nocow
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class nocow {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, K, adj;
	public static ArrayList<String[]> words, needed;
	public static int[] used;

	private static void compute() {

		used = new int[needed.size()];

		for (int index = 0; index < needed.size(); index++) {

			String[] array = needed.get(index);

			int config = 0;

			for (int i = 0; i < array.length; i++)
				config += Math.pow(2, array.length - 1 - i)
						* findVal(array[i], i);

			used[index] = config;

		}

		Arrays.sort(used);

	}

	private static int findVal(String s, int level) {

		String[] array = words.get(level);

		if (array[0].equals(s))
			return 0;

		return 1;

	}

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("nocow.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("nocow.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		K = Integer.parseInt(line[1]);
		needed = new ArrayList<String[]>();

		for (int i = 0; i < N; i++)
			readLine(i);

		for (String[] s : words)
			Arrays.sort(s);

		compute();

		for (int i : used)
			if (i < K)
				K++;

		String s = Integer.toBinaryString(K - 1);

		for (int i = s.length(); i < adj; i++)
			s = "0" + s;

		String ans = "";

		for (int i = 0; i < adj; i++)
			ans += words.get(i)[Integer.parseInt(s.charAt(i) + "")] + " ";

		out.println(ans);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void readLine(int x) throws IOException {

		String line = in.readLine();

		String[] s = line.split(" ");

		if (x == 0) {

			adj = s.length - 5;
			words = new ArrayList<String[]>();
			for (int i = 0; i < adj; i++)
				words.add(new String[2]);

		}

		for (int i = 4; i < s.length - 1; i++) {

			String[] list = words.get(i - 4);

			if (list[0] == null)
				list[0] = s[i];
			else if (list[1] == null && !list[0].equals(s[i]))
				list[1] = s[i];

		}

		String[] need = new String[adj];
		for (int i = 4; i < s.length - 1; i++)
			need[i - 4] = s[i];

		needed.add(need);

	}

}
