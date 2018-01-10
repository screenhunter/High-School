/*
PROG: auction
LANG: JAVA
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class auction {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("auction.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("auction.out")));
		
		String[] nums = in.readLine().split(" ");
		int N = Integer.parseInt(nums[0]);
		int M = Integer.parseInt(nums[1]);
		
		int[] f = new int[M];
		
		for (int i = 0; i < M; i++)
			f[i] = Integer.parseInt(in.readLine());
		
		Arrays.sort(f);
		
		int money = 0;
		int x = 0;
		
		if (N > M)
			N = M;
		
		for (int i = N-1; i >= 0; i--)
			if (money < f[i]*i)
				x = i;
				
		out.println(f[x] + " " + f[x]*(N-x));
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
