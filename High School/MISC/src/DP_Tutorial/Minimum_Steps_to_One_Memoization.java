package DP_Tutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Minimum_Steps_to_One_Memoization {
	
	public static int n;
	public static int[] cache;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		cache = new int[n+1];
		Arrays.fill(cache, -1);
		cache[1] = 0;
		System.out.println(recur(n));
		in.close();
		
	}

	private static int recur(int x) {
		
		if (cache[x] != -1)
			return cache[x];
		
		int ans = recur(x-1);
		if (x % 2 == 0)
			ans = Math.min(ans, recur(x/2));
		if (x % 3 == 0)
			ans = Math.min(ans, recur(x/3));
		
		cache[x] = ans + 1;
		
		return ans + 1;
		
	}

}
