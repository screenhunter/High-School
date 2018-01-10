/*
prog: highcard
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class highcard {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static int[] cards;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("highcard.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("highcard.out")));
		
		N = Integer.parseInt(in.readLine());
		
		cards = new int[N*2 + 1];
		for (int i = 0; i < N; i++)
			cards[Integer.parseInt(in.readLine())] = 1;
		
		int points = 0;
		int count = 0;
		for (int i = 1; i < 2*N+1; i++) {
			if (cards[i] == 0) {
				if (count > 0) {
					points++;
					count--;
				}
			} else
				count++;
		}
		
		out.println(points);
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
