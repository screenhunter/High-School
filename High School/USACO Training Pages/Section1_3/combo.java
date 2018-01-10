/*
PROB: combo
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class combo {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static int pass[][];
	public static HashSet<Integer> poss;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("combo.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
		
		N = Integer.parseInt(in.readLine());
		pass = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			String[] line = in.readLine().split(" ");
			for (int j = 0; j < 3; j++)
				pass[i][j] = Integer.parseInt(line[j]);
		}
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		poss = new HashSet<Integer>();
		
		for (int x = 0; x < 2; x++) {
			
			for (int i = -2; i < 3; i++)
				a.add((pass[x][0] + N + i) % N);
			for (int i = -2; i < 3; i++)
				b.add((pass[x][1] + N + i) % N);
			for (int i = -2; i < 3; i++)
				c.add((pass[x][2] + N + i) % N);
			
			for (int d1: a)
				for (int d2: b)
					for (int d3: c)
						poss.add(d1*N*N + d2*N + d3);
			
			a.clear();
			b.clear();
			c.clear();
			
		}
		
		out.println(poss.size());
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
