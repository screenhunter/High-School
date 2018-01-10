/*
rkhanna
Rajat Khanna
01/11/2014
PROG: bteams
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class bteams {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int[] skill;
	public static int ans;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("bteams.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("bteams.out")));
		
		skill = new int[12];
		for (int i = 0; i < 12; i++)
			skill[i] = Integer.parseInt(in.readLine());
		
		ans = Integer.MAX_VALUE;
		recur(new int[4], new int[4], 0);
		
		out.println(ans);
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static void recur(int[] sum, int[] count, int pos) {

		if (pos == 12)
			check(sum);
		else
			for (int i = 0; i < 4; i++)
				if (count[i] == 3)
					continue;
				else {
					
					sum[i] += skill[pos];
					count[i]++;
					recur(sum, count, pos + 1);
					sum[i] -= skill[pos];
					count[i]--;
			
				}
		
	}

	private static void check(int[] sum) {
		
		int max = sum[0];
		int min = sum[0];
		
		for (int i = 0; i < 4; i++)
			if (sum[i] > max)
				max = sum[i];
			else if (sum[i] < min)
				min = sum[i];
		
		if (max - min < ans)
			ans = max - min;
		
	}

}
