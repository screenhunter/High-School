/*
PROG: E
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class The_Cure {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, strength;
	public static ArrayList<Integer> nums, dose;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("E.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("E.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		strength = Integer.parseInt(line[1]);
		
		nums = new ArrayList<Integer>();
		dose = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			nums.add(Integer.parseInt(line[0]));
			dose.add(Integer.parseInt(line[1]));
			
		}

		run();

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void run() throws IOException {

		for (int i = 0; i < N; i++) {

			if (nums.get(i) >= strength) {
				
				strength += nums.get(i);
				continue;
				
			}

		}

	}

}
