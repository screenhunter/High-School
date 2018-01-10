/*
rkhanna 
Rajat Khanna
12/13/2014
prog: cowjog
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class cowjog {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, T;
	public static int[] start, end;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("cowjog.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("cowjog.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		T = Integer.parseInt(line[1]);
		end = new int[N];
		start = new int[N];
		
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			start[i] = Integer.parseInt(line[0]);
			end[i] = Integer.parseInt(line[1])*T + start[i];
			
		}
		
		int max = end[N-1];
		int clusters = 1;
		for (int i = N-1; i >= 0; i--)
			if (end[i] < max) {
				
				clusters++;
				max = end[i];
				
			}
		
		out.println(clusters);

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
