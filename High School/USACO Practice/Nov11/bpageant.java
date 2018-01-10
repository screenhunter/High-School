/*
PROG: bpageant
LANG: JAVA
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class bpageant {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("bpageant.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("bpageant.out")));
		
		String[] nums = in.readLine().split(" ");
		
		int[] size = new int[2];
		
		for (int i = 0; i < 2; i++)
			size[i] = Integer.parseInt(nums[i]);
		
		char[][] patch = new char[size[0]][size[1]];
		
		for (int i = 0; i < size[0]; i++) {
			
			String line = in.readLine();
			patch[i] = line.toCharArray();
			
		}
		
		boolean bo = false;
	
		for (int i = 0; i < size[0]; i++) {
			
			for (int j = 0; j < size[1]; j++) {
				
				if (patch[i][j] == 'X') {
					
					if (bo == false) {
						
						fill(patch, i, j, '1');
						bo = true;
						
					} else {
						
						fill(patch, i, j, '2');
						break;
						
					}
					
				}
				
			}
			
		}
		
		int min = 100000000;
		
		for (int i = 0; i < size[0]; i++)
			for (int j = 0; j < size[1]; j++)
				if (patch[i][j] == '1')
					for (int a = 0; a < size[0]; a++)
						for (int b = 0; b < size[1]; b++)
							if (patch[a][b] == '2')
								if (Math.abs(a - i) + Math.abs(j - b) < min)
									min = Math.abs(a - i) + Math.abs(j - b);
		
		out.println(min-1);
		
		in.close();
		out.close();
		System.exit(0);

	}
	
	private static void fill(char[][] g, int r, int c, char num) {
		
		if (c >= g[0].length || c < 0)
            return;
       	
         if (r >= g.length || r < 0)
            return;
         
         if (g[r][c] == num || g[r][c] == '.')
        	return;
         
         if (g[r][c] == 'X')
            g[r][c] = num;
         
         fill(g, r+1, c, num);
         fill(g, r, c+1, num);
         fill(g, r-1, c, num);
         fill(g, r, c-1, num);
         
	}
	
}
