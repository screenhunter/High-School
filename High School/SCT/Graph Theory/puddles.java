/*
PROG: puddles
LANG: JAVA
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class puddles {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("puddles.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("puddles.out")));
		
		int N = Integer.parseInt(in.readLine());
		
		char[][] farm = new char[N][N];
		
		for (int i = 0; i < N; i++)
			farm[i] = in.readLine().toCharArray();
		
		int count = 0;
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (farm[i][j] == 'W') {
					
					count++;
					fill(farm, i, j);
					
				}
		
		out.println(count);
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	private static void fill(char[][] g, int r, int c) {
		
		if (c >= g[0].length || c < 0)
            return;
       	
         if (r >= g.length || r < 0)
            return;
         
         if (g[r][c] == '#' || g[r][c] == '&')
        	return;
         
         if (g[r][c] == 'W')
            g[r][c] = '&';
         
         fill(g, r+1, c);
         fill(g, r, c+1);
         fill(g, r-1, c);
         fill(g, r, c-1);
         
	}

}
