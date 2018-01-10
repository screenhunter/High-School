/*
prog: cardgame
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.TreeSet;

public class cardgame {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static TreeSet<Integer> e1, e2;
	public static TreeSet<Integer> bessie;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("cardgame.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("cardgame.out")));
		
		N = Integer.parseInt(in.readLine());
		bessie = new TreeSet<Integer>();
		e1 = new TreeSet<Integer>();
		e2 = new TreeSet<Integer>();
		
		for (int i = 1; i < 2*N+1; i++)
			bessie.add(i);
		
		for (int i = 0; i < N; i++) {
			
			int x = Integer.parseInt(in.readLine());
			
			if (i < N/2)
				e1.add(x);
			else
				e2.add(x);
			bessie.remove(x);
			
		}
		
		int points = 0;
		
		for (int i = 0; i < N/2; i++) {
			if (e1.last() < bessie.last())
				points++;
			e1.remove(e1.last());
			bessie.remove(bessie.last());
		}
		
		for (int i = N/2; i < N; i++) {
			if (e2.first() > bessie.first())
				points++;
			e2.remove(e2.first());
			bessie.remove(bessie.first());
		}
		
		out.println(points);;
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
