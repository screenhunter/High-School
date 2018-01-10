
/*
PROG: money
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class money {

	public static BufferedReader in;
	public static PrintWriter out;
	public static long[] coins, cache;
	public static int V, N;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("money.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("money.out")));

		String[] line = in.readLine().split(" ");
		V = Integer.parseInt(line[0]);
		N = Integer.parseInt(line[1]);
		cache = new long[(int) (N + 1)];
		cache[0] = 1;
		coins = new long[(int) V];
		
		line = in.readLine().split(" ");
		int cur = 0;
		while (line.length > 0) {
			for (int i = 0; i < line.length; i++)
				coins[i + cur] = Long.parseLong(line[i]);
			cur += line.length;
			if (cur == V)
				break;
			line = in.readLine().split(" ");
			
		}
		
		System.out.println(Arrays.toString(coins));
		
        for (int i=0; i<V; i++) {
           for (int j = (int) coins[i]; j<=N; j++)
        	   if (j >= coins[i])
        		   cache[j] += cache[(int) (j-coins[i])];
           System.out.println(Arrays.toString(cache));
        }
		
		out.println(cache[(int) N]);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
