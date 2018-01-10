/*
PROG: wide
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class wide {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, left, right;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("wide.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("wide.out")));
		N = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < N; i++)
			if (i == 0) {
				
				left = Integer.parseInt(in.readLine());
				right = left;
				
			} else {
				
				int x = Integer.parseInt(in.readLine());
				if (right < x)
					right = x;
				if (left > x)
					left = x;
				
			}
		
		out.println(right - left);
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

}
