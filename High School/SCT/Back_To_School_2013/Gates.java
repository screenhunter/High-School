/*
PROG: D
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Gates {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M;
	public static int[] switches;
	public static ArrayList<String> lines;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("D.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("D.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		
		lines = new ArrayList<String>();
		
		for (int i = 0; i < N; i++)
			lines.add(in.readLine());
		switches = new int[M];
		
		recur(0);
		
		out.println("No");
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static void recur(int x) throws IOException {
		
		if (x >= M) {
			
			check();
			return;
			
		}
		
		recur(x+1);
		
		for (int i = 0; i < M; i++)
			if (lines.get(x).charAt(i) == 'Y')
				switches[i] += 1;
		
		recur(x+1);
		
	}

	private static void check() throws IOException {

		for (int i = 0; i < M; i++)
			if (switches[i] % 2 != 1)
				return;
		
		out.println("Yes");
		out.close();
		in.close();
		System.exit(0);
		
	}

}
