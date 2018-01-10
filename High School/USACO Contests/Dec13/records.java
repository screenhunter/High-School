/*
rkhanna
Rajat Khanna
12/14/2013
PROG: records
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class records {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, max;
	public static HashMap<String, Integer> map;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("records.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("records.out")));

		map = new HashMap<String, Integer>();
		N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++)
			read();

		out.println(max);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void read() throws IOException {

		String[] line = in.readLine().split(" ");
		Arrays.sort(line);
		String key = line[0] + " " + line[1] + " " + line[2];
		int value = 1;
		if (map.get(key) != null)
			value += map.get(key);
		map.put(key, value);

		if (value > max)
			max = value;

	}

}
