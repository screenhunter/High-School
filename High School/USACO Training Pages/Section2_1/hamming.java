/*
PROG: hamming
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class hamming {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, B, D;
	public static ArrayList<String> list;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("hamming.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("hamming.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		B = Integer.parseInt(line[1]);
		D = Integer.parseInt(line[2]);

		list = new ArrayList<String>();
		String start = "";
		populate(start);
		depopulate();
		print();
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void print() {
		
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			
			count++;
			if (count == 10 || i == N - 1) {
				
				out.println(convert(list.get(i)));
				count = 0;
				
			} else
				out.print(convert(list.get(i)) + " ");
			
		}
		
	}

	private static String convert(String string) {
		
		int x = 0;
		
		for (int i = 0; i < B; i++)
			x += Math.pow(2, B - i - 1) * Integer.parseInt(string.charAt(i) + "");
		
		return x + "";
		
	}

	private static void depopulate() {

		ArrayList<String> keep = new ArrayList<String>();
		keep.add(list.get(0));
		
		for (int i = 1; i < list.size(); i++)
			if (check(keep, list.get(i)))
				keep.add(list.get(i));
		
		list = keep;

	}

	private static boolean check(ArrayList<String> keep, String cur) {
		
		int count = 0;
		
		for (String s: keep) {
			
			count = 0;
			for (int i = 0; i < B; i++)
				if (s.charAt(i) != cur.charAt(i))
					count++;
			
			if (count < D)
				return false;
			
		}
		
		return true;

	}

	private static void populate(String s) {

		if (s.length() == B) {

			list.add(s);
			return;

		}

		populate(s + "0");
		populate(s + "1");

	}

}