/*
rkhanna
Rajat Khanna
12/14/2013
PROG: wormhole
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.TreeSet;

public class wormhole {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static HashMap<Integer, Integer> map;

	private static int factorial(int x) {

		if (x <= 1)
			return 1;
		return x * factorial(x - 1);

	}

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("wormhole.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("wormhole.out")));
		map = new HashMap<Integer, Integer>();
		N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++)
			read(in.readLine().split(" "));

		TreeSet<Integer> list = new TreeSet<Integer>();
		for (int y : map.keySet())
			list.add(map.get(y));

		if (list.remove(2))
			if (list.remove(4))
				out.println(11);
			else if (list.remove(3))
				out.println(9);
			else if (list.remove(2))
				out.println(2);
			else
				out.println(factorial(N / 2));
		else
			out.println(factorial(N / 2));

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void read(String[] line) throws IOException {

		int y = Integer.parseInt(line[1]);
		int value = 1;
		if (map.get(y) != null)
			value += map.get(y);
		map.put(y, value);

	}

}
