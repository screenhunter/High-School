/*
rkhanna
Rajat Khanna
02/06/2014
PROG: auto
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class auto {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, W, K;
	public static String[] dict;
	public static HashMap<String, Integer> map;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("auto.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("auto.out")));

		String[] line = in.readLine().split(" ");
		W = Integer.parseInt(line[0]);
		N = Integer.parseInt(line[1]);
		dict = new String[W];
		map = new HashMap<String, Integer>();

		String str;
		for (int i = 0; i < W; i++) {

			str = in.readLine();
			map.put(str, i+1);
			dict[i] = str;

		}

		Arrays.sort(dict);

		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			K = Integer.parseInt(line[0]);
			int index = Arrays.binarySearch(dict, line[1]);
			index = -index - 2 + K;
			
			if (index >= W)
				out.println(-1);
			else
				out.println(map.get(dict[index]));

		}

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
