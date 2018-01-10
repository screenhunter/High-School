/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: censor
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class censor {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static String S, T;
	
	public static void main(String[] args) throws Exception {
		
		//long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("censor.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
		
		S = in.readLine();
		T = in.readLine();
		
		while (S.indexOf(T) != -1)
			S = S.replace(T, "");
		
		out.println(S);
		
		//System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
