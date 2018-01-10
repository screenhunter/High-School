/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: superbull
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeSet;

public class superbull {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static ArrayList<Integer> list;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("superbull.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("superbull.out")));
		list = new ArrayList<Integer>();
		
		N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(in.readLine()));
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < N; i++)
			for (int j = i+1; j < N; j++)
				set.add(list.get(i) ^ list.get(j));
		
		long ans = 0;
		
		for (int i = 0; i < N-1; i++)
			ans += set.pollLast();
		
		out.println(ans);
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
