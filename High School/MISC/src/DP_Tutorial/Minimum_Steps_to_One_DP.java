package DP_Tutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Minimum_Steps_to_One_DP {
	
	public static int n;
	public static int[] cache;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		cache = new int[n+1];
		Arrays.fill(cache, -1);
		cache[1] = 0;
		dp();
		System.out.println(cache[n]);
		in.close();
		
	}

	private static void dp() {
		
		for (int i = 2; i <= n; i++) {
			
			cache[i] = cache[i-1] + 1;
			
			if (i % 2 == 0)
				cache[i] = Math.min(cache[i], cache[i/2] + 1);
			if (i % 3 == 0)
				cache[i] = Math.min(cache[i], cache[i/3] + 1);
			
		}
		
	}

}
