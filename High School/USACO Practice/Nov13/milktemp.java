/*
rkhanna
Rajat Khanna
11/16/2013
PROG: milktemp
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.TreeSet;

public class milktemp {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, X, Y, Z, max, cur;
	public static TreeSet<Integer> nums;
	public static HashMap<Integer, Integer> low, high;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("milktemp.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("milktemp.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		X = Integer.parseInt(line[1]);
		Y = Integer.parseInt(line[2]);
		Z = Integer.parseInt(line[3]);
		nums = new TreeSet<Integer>();
		low = new HashMap<Integer, Integer>();
		high = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			
			nums.add(a);
			nums.add(b);
			
			if (low.keySet().contains(a))
				low.put(a, low.get(a) + 1);
			else
				low.put(a, 1);
			
			if (high.keySet().contains(b))
				high.put(b, high.get(b) + 1);
			else
				high.put(b, 1);
			
		}
		
		cur = N*X;
		max = cur;
		
		for (int i: nums) {
			
			if (low.keySet().contains(i))
				cur += (Y - X)*low.get(i);
			
			if (cur > max)
				max = cur;
			
			if (high.keySet().contains(i))
				cur += (Z - Y)*high.get(i);
			
		}
		
		out.println(max);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
