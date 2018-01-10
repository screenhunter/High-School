/*
PROG: C
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Number_Game {

	public static BufferedReader in;
	public static PrintWriter out;
	public static long N;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("C.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("C.out")));
		
		N = Long.parseLong(in.readLine());
		
		if (isDoublePrime(N))
			out.println("Zombies");
		else
			out.println("Ryan");
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static boolean isDoublePrime(long x) {
		
		int y = findFactor(x);
		
		if (y == 1)
			return false;
		
		x = x/y;
		
		if (findFactor(x) == 1)
			return true;
		
		return false;
		
	}

	private static int findFactor(long x) {
		
		for (int i = 2; i <= Math.sqrt(x); i++)
			if (x % i == 0)
				return i;
		
		return 1;
		
	}

}
