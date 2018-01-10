/*
PROG: zerosum
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class zerosum {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("zerosum.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("zerosum.out")));
		
		N = Integer.parseInt(in.readLine());
		
		find("1", 2);
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static void find(String exp, int i) {
		
		if (i > N) {
			
			if (calc(exp) == 0)
				out.println(exp);
			
			return;
			
		}
		
		find(exp + " " + i, i+1);
		find(exp + "+" + i, i+1);
		find(exp + "-" + i, i+1);
		
		
	}

	private static int calc(String exp) {
		
		exp = exp.replaceAll(" ", "");
		
		int sum = 0;
		
		while (exp.length() != 0) {
			
			String a = "";
			
			if (exp.charAt(0) == '-')
				a += '-';
			
			if (exp.charAt(0) == '+' || exp.charAt(0) == '-')
				exp = exp.substring(1);
			
			while (exp.length() > 0 && exp.charAt(0) != '+' && exp.charAt(0) != '-') {
				
				a += exp.charAt(0);
				exp = exp.substring(1);
				
			}
			
			sum += Integer.parseInt(a);
			
		}
		
		return sum;
		
	}

}
