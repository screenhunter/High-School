/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: stampede
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;

public class stampede {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static HashMap<Integer, Integer> fj;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("stampede.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("stampede.out")));
		
		N = Integer.parseInt(in.readLine());
		fj = new HashMap<Integer, Integer>();
		
		String[] line;
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			
			
			
		}
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
