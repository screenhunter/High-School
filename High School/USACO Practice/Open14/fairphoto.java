/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: fairphoto
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class fairphoto {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static int[][] cows;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("fairphoto.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("fairphoto.out")));
		
		N = Integer.parseInt(in.readLine());
		cows = new int[N][4];
		
		String[] line;
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			
			
		}
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		System.exit(0);
		
	}

}
